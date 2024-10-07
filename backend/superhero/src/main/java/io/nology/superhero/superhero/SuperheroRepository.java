package io.nology.superhero.superhero;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nology.superhero.superhero.entity.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {

}
