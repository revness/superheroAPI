package io.nology.superhero.superhero;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
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

    public static class Powerstats {
        private int intelligence;
        private int strength;
        private int speed;
        private int durability;
        private int power;
        private int combat;

        }

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Appearance {
        private String gender;
        private String race;

        @ElementCollection
        private List<String> height;

        @ElementCollection
        private List<String> weight;

        private String eyeColor;
        private String hairColor;

    }

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

    public static class Work {
        private String occupation;
        private String base;

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

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Images {
        private String xs;
        private String sm;
        private String md;
        private String lg;

    }
}
