CREATE DATABASE patitas;

\c patitas;

CREATE TABLE tipo_persona(
   tipo_id serial PRIMARY KEY,
   tipo_descripcion VARCHAR (255) UNIQUE NOT NULL
);

CREATE TABLE personas (
	persona_id serial PRIMARY KEY,
	nombre VARCHAR ( 250 ) NOT NULL,
	paterno VARCHAR ( 100 ) NOT NULL,
	materno VARCHAR ( 100 ) NOT NULL,
    tipo_persona INT NOT NULL,
	creado TIMESTAMP NOT NULL,
    FOREIGN KEY (tipo_persona)
      REFERENCES tipo_persona (tipo_id)
);

CREATE TABLE veterinario(
   veterinario_id serial PRIMARY KEY,
   persona_id INT NOT NULL,
   cedula VARCHAR (255) UNIQUE NOT NULL,
   creado TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY (persona_id)
    REFERENCES personas (persona_id)
);

CREATE TABLE tipo_paciente(
   tpaciente_id serial PRIMARY KEY,
   tipo_descripcion VARCHAR (255) UNIQUE NOT NULL
);

CREATE TABLE paciente(
   paciente_id serial PRIMARY KEY,
   nombre_paciente VARCHAR (100) UNIQUE NOT NULL,
   tipo_paciente INT NOT NULL,
   fecha_nacimiento DATE NUll,
   telefono VARCHAR (10) NULL,
   descripcion VARCHAR (255) NULL,
   creado TIMESTAMP NOT NULL,
   FOREIGN KEY (tipo_paciente)
    REFERENCES tipo_paciente (tpaciente_id)
);

CREATE TABLE propietario(
    propietario_id serial PRIMARY KEY,
    persona_id INT NOT NULL,
    paciente_id INT NOT NULL,
    creado TIMESTAMP NOT NULL,
    UNIQUE (persona_id, paciente_id),
    FOREIGN KEY (paciente_id)
     REFERENCES paciente (paciente_id),
    FOREIGN KEY (persona_id)
     REFERENCES personas (persona_id)
);

CREATE TABLE cita(
    cita_id serial PRIMARY KEY,
    persona_id INT NOT NULL,
    paciente_id INT NOT NULL,
    dia DATE NOT NUll,
    hora TIME NOT NULL,
    FOREIGN KEY (paciente_id)
        REFERENCES paciente (paciente_id),
    FOREIGN KEY (persona_id)
        REFERENCES personas (persona_id)
);

INSERT INTO public.tipo_persona
(tipo_id, tipo_descripcion)
VALUES
    (nextval('tipo_persona_tipo_id_seq'::regclass), 'Clientes'),
    (nextval('tipo_persona_tipo_id_seq'::regclass), 'Veterinarios');

INSERT INTO public.tipo_paciente
(tpaciente_id, tipo_descripcion)
VALUES
    (nextval('tipo_paciente_tpaciente_id_seq'::regclass), 'Gato'),
    (nextval('tipo_paciente_tpaciente_id_seq'::regclass), 'Perro'),
    (nextval('tipo_paciente_tpaciente_id_seq'::regclass), 'Marsupial'),
    (nextval('tipo_paciente_tpaciente_id_seq'::regclass), 'Reptil');