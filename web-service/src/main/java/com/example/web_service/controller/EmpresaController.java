package com.example.web_service.controller;

import com.example.web_service.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private List<Empresa> empresas = new ArrayList<>();

    public EmpresaController() {
        empresas.add(new Empresa(1, "Empresa Alfa LTDA", "12.345.678/0001-90", "contato@empresa-alfa.com"));
        empresas.add(new Empresa(2, "Beta Comércio ME", "98.765.432/0001-10", "beta@comercio.com"));
        empresas.add(new Empresa(3, "Gamma Serviços S.A.", "11.222.333/0001-44", "servicos@gamma.com"));
        empresas.add(new Empresa(4, "Delta Engenharia", "22.333.444/0001-55", "contato@deltaeng.com"));
        empresas.add(new Empresa(5, "Epsilon Digital", "33.444.555/0001-66", "email@epsilondigital.com"));
    }

    @GetMapping
    public List<Empresa> listar() {
        return empresas;
    }

    @PostMapping
    public Empresa adicionar(@RequestBody Empresa empresa) {
        empresas.add(empresa);
        return empresa;
    }

    @PutMapping("/{id}")
    public Empresa atualizar(@PathVariable int id, @RequestBody Empresa nova) {
        for (Empresa e : empresas) {
            if (e.getId() == id) {
                e.setNome(nova.getNome());
                e.setCnpj(nova.getCnpj());
                e.setEmailContato(nova.getEmailContato());
                return e;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        empresas.removeIf(e -> e.getId() == id);
    }
}