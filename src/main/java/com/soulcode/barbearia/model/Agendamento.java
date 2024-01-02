package com.soulcode.barbearia.model;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCliente;
    private LocalDate dataNascimentoCliente;
    private LocalDate dataAgendamento;
    private LocalTime horarioAgendamento;
    private String servicoSolicitado;
    public String getServicoSolicitado() {
      return servicoSolicitado;
    }
    public void setServicoSolicitado(String servicoSolicitado) {
      this.servicoSolicitado = servicoSolicitado;
    }
    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public String getNomeCliente() {
      return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
      this.nomeCliente = nomeCliente;
    }
    public LocalDate getDataNascimentoCliente() {
      return dataNascimentoCliente;
    }
    public void setDataNascimentoCliente(LocalDate dataNascimentoCliente) {
      this.dataNascimentoCliente = dataNascimentoCliente;
    }
    public LocalDate getDataAgendamento() {
      return dataAgendamento;
    }
    public void setDataAgendamento(LocalDate dataAgendamento) {
      this.dataAgendamento = dataAgendamento;
    }
    public LocalTime getHorarioAgendamento() {
      return horarioAgendamento;
    }
    public void setHorarioAgendamento(LocalTime horarioAgendamento) {
      this.horarioAgendamento = horarioAgendamento;
    }

    
}