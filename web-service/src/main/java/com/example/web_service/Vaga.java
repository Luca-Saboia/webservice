package com.example.web_service;

public class Vaga {
    private int id;
    private String titulo;
    private String descricao;
    private String publicacao;
    private boolean ativo;
    private int idEmpresa;

    public Vaga(int id, String titulo, String descricao, String publicacao, boolean ativo, int idEmpresa) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.publicacao = publicacao;
        this.ativo = ativo;
        this.idEmpresa = idEmpresa;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
}