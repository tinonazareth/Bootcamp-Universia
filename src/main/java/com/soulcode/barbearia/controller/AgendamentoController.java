package com.soulcode.barbearia.controller;

import com.soulcode.barbearia.model.Agendamento;
import com.soulcode.barbearia.repository.AgendamentoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoRepository agendamentoRepository;

    //@Autowired
    public AgendamentoController(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @GetMapping
    public String getAllAgendamentos(Model model) {
        List<Agendamento> agendamentos = agendamentoRepository.findAll();
        model.addAttribute("agendamentos", agendamentos);
        return "agendamento/list";
    }

    @GetMapping("/{id}")
    public String getAgendamentoById(@PathVariable Integer id, Model model) {
        Optional<Agendamento> agendamentoOptional = agendamentoRepository.findById(id);
        agendamentoOptional.ifPresent(agendamento -> model.addAttribute("agendamento", agendamento));
        return "agendamento/detail";
    }

    @GetMapping("/form")
    public String showAgendamentoForm(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "agendamento/form";
    }

    @PostMapping("/save")
    public String saveAgendamento(@ModelAttribute Agendamento agendamento) {
        // Add any validation or business logic before saving
        agendamentoRepository.save(agendamento);
        return "redirect:/agendamentos";
    }

    @GetMapping("/edit/{id}")
    public String editAgendamento(@PathVariable Integer id, Model model) {
        Optional<Agendamento> agendamentoOptional = agendamentoRepository.findById(id);
        agendamentoOptional.ifPresent(agendamento -> model.addAttribute("agendamento", agendamento));
        return "agendamento/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteAgendamento(@PathVariable Integer id) {
        agendamentoRepository.deleteById(id);
        return "redirect:/agendamentos";
    }

    @Override
    public String toString() {
        return "AgendamentoController [agendamentoRepository=" + agendamentoRepository + "]";
    }

    
}
