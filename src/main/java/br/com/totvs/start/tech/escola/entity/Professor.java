package br.com.totvs.start.tech.escola.entity;

public class Professor {

    private String nome;
    private String horario;
    private String salas;
    private String materias;

    public Professor(String nome, String horario, String salas, String materias) {
        this.nome = nome;
        this.horario = horario;
        this.salas = salas;
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSalas() {
        return salas;
    }

    public void setSalas(String salas) {
        this.salas = salas;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
}


