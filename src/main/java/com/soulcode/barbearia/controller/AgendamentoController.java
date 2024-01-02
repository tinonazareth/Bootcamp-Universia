package com.soulcode.barbearia.controller;

import com.soulcode.barbearia.model.Agendamento;
import com.soulcode.barbearia.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }
}