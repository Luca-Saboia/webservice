package com.example.web_service;

public class Empresa {
    private int id;
    private String nome;
    private String cnpj;
    private String emailContato;

    public Empresa(int id, String nome, String cnpj, String emailContato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
    public String getEmailContato() { return emailContato; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public void setEmailContato(String emailContato) { this.emailContato = emailContato; }
}