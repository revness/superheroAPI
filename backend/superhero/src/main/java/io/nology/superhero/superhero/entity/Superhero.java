package io.nology.superhero.superhero.entity;

import java.util.List;

import io.nology.superhero.superhero.entity.embedded.Appearance;
import io.nology.superhero.superhero.entity.embedded.Images;
import io.nology.superhero.superhero.entity.embedded.Powerstats;
import io.nology.superhero.superhero.entity.embedded.Work;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
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

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Biography {
        private String fullName;
        private String alterEgos;

        @ElementCollection
        private List<String> aliases;

        private String placeOfBirth;
        private String firstAppearance;
        private String publisher;
        private String alignment;

    }

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Connections {
        private String groupAffiliation;
        private String relatives;

    }

}
