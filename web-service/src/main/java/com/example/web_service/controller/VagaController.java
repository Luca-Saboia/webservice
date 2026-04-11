package com.example.web_service.controller;

import com.example.web_service.Vaga;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private List<Vaga> vagas = new ArrayList<>();

    public VagaController() {
        vagas.add(new Vaga(1, "Desenvolvedor Java", "Backend com Java e Spring", "2025-10-01", true, 1));
        vagas.add(new Vaga(2, "Analista de Suporte Técnico", "Suporte a clientes", "2025-09-27", true, 2));
        vagas.add(new Vaga(3, "Engenheiro de Software", "Sistemas corporativos", "2025-10-03", false, 3));
        vagas.add(new Vaga(4, "Analista de Dados", "SQL e Python", "2025-09-18", true, 4));
        vagas.add(new Vaga(5, "Designer Digital", "UX/UI", "2025-09-30", false, 5));
        vagas.add(new Vaga(6, "Consultor de Projetos", "Gestão de projetos", "2025-10-06", true, 1));
        vagas.add(new Vaga(7, "Programador Full Stack", "Frontend e Backend", "2025-10-04", true, 2));
    }

    @GetMapping
    public List<Vaga> listar() {
        return vagas;
    }

    @PostMapping
    public Vaga adicionar(@RequestBody Vaga vaga) {
        vagas.add(vaga);
        return vaga;
    }

    @PutMapping("/{id}")
    public Vaga atualizar(@PathVariable int id, @RequestBody Vaga nova) {
        for (Vaga v : vagas) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        vagas.removeIf(v -> v.getId() == id);
    }
}