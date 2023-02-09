package br.com.totvs.start.tech.escola.entity;

public class Escola {

    private int id;
    private String nome;
    private String periodo;
    private String turmas;

    public Escola(int id, String nome, String periodo, String turmas) {
        this.id = id;
        this.nome = nome;
        this.periodo = periodo;
        this.turmas = turmas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }
}


