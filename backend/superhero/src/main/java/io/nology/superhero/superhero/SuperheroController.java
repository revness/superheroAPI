package io.nology.superhero.superhero;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nology.superhero.superhero.entity.Superhero;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("superheroes")
public class SuperheroController {
    @Autowired
    private SuperheroService superheroService;

    @PostMapping
    public ResponseEntity<Superhero> createSuperhero(@Valid @RequestBody CreateSuperheroDTO data) throws Exception {
        Superhero createdSuperhero = this.superheroService.createSuperhero(data);
        return new ResponseEntity<Superhero>(createdSuperhero, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Superhero>> findAllSuperheroes() {
        List<Superhero> superheroes = this.superheroService.findAllSuperheroes();
        return new ResponseEntity<List<Superhero>>(superheroes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Superhero> findSuperheroById(@PathVariable Long id) throws Exception {
        Optional<Superhero> superhero = this.superheroService.findSuperheroById(id);
        if (superhero.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<Superhero>(superhero.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuperheroById(@PathVariable Long id) throws Exception {
        boolean isDeleted = this.superheroService.deleteSuperheroById(id);
        if (!isDeleted) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
