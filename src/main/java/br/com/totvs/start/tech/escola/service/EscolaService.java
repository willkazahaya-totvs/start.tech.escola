package br.com.totvs.start.tech.escola.service;

import br.com.totvs.start.tech.escola.entity.Escola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface EscolaService {

        public Escola criar(int id, String nome, String periodo, String turma );


}
