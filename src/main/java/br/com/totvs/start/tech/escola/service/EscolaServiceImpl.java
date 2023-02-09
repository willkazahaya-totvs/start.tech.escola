package br.com.totvs.start.tech.escola.service;

import br.com.totvs.start.tech.escola.entity.Escola;

import java.time.LocalDate;
import java.time.LocalTime;

public class EscolaServiceImpl implements EscolaService{
   @Override
    public Escola criar(int id, String nome, String turmas, String periodo) {
    Escola novaEscola = new Escola();

        novaEscola.setId(id);
        novaEscola.setNome(nome);
        novaEscola.setTurmas(turmas);
        novaEscola.setPeriodo(periodo);

        return novaEscola;


}
