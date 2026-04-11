package com.example.web_service;

public class Estudante {
    private int id;
    private String nome;
    private String email;
    private String nascimento;
    private int anoIngresso;

    public Estudante(int id, String nome, String email, String nascimento, int anoIngresso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.anoIngresso = anoIngresso;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getNascimento() { return nascimento; }
    public int getAnoIngresso() { return anoIngresso; }

    public void setNome(String nome) { this.nome = nome; }
}