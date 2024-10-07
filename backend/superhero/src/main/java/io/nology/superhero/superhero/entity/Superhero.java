package io.nology.superhero.superhero.entity;

import io.nology.superhero.superhero.entity.embedded.Appearance;
import io.nology.superhero.superhero.entity.embedded.Biography;
import io.nology.superhero.superhero.entity.embedded.Connections;
import io.nology.superhero.superhero.entity.embedded.Images;
import io.nology.superhero.superhero.entity.embedded.Powerstats;
import io.nology.superhero.superhero.entity.embedded.Work;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "superheroes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;

    @Embedded
    private Powerstats powerstats;

    @Embedded
    private Appearance appearance;

    @Embedded
    private Biography biography;

    @Embedded
    private Work work;

    @Embedded
    private Connections connections;

    @Embedded
    private Images images;
}
