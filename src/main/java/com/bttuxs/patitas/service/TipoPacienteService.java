package com.bttuxs.patitas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bttuxs.patitas.entity.TipoPaciente;
import com.bttuxs.patitas.repository.TpacienteRepository;

@Service
public class TipoPacienteService {
    @Autowired
    private TpacienteRepository tpacienteRepository;

    public List<TipoPaciente> getTipoPacientes(){
        return tpacienteRepository.findAll();
    }

    
}
