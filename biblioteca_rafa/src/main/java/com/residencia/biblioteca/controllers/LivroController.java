package com.residencia.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.services.LivroService;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAll() {
        return livroService.findAll();
    }

    @PostMapping
    public Livro create(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getById(@PathVariable Long id) {
        return livroService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Livro update(@PathVariable Long id, @RequestBody Livro livro) {
        if (livroService.findById(id).isPresent()) {
            livro.setCodigoLivro(id);
            return livroService.save(livro);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        livroService.deleteById(id);
    }
}
