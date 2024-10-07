package io.nology.superhero.superhero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("superheroes")
public class SuperheroController {
    @Autowired
    private SuperheroService superheroService;

    @PostMapping
    public ResponseEntity<Superhero> createSuperhero(@Valid @RequestBody CreateSuperheroDTO data) throws Exception {
        Superhero createdSuperhero = this.superheroService.createSuperhero(data);
        return ResponseEntity<Superhero>(createdSuperhero, HttpStatus.CREATED);
    }
}
