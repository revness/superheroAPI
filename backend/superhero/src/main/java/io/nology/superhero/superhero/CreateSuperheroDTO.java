package io.nology.superhero.superhero;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import java.util.List;

@Data
public class CreateSuperheroDTO {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Slug is required")
    private String slug;

    @NotNull(message = "Powerstats are required")
    private PowerstatsDTO powerstats;

    @NotNull(message = "Appearance is required")
    private AppearanceDTO appearance;

    @NotNull(message = "Biography is required")
    private BiographyDTO biography;

    @NotBlank(message = "Occupation is required")
    private String occupation;

    private String base;

    private String groupAffiliation;
    private String relatives;

    @Data
    public static class PowerstatsDTO {
        @Min(0)
        @Max(100)
        private int intelligence;

        @Min(0)
        @Max(100)
        private int strength;

        @Min(0)
        @Max(100)
        private int speed;

        @Min(0)
        @Max(100)
        private int durability;

        @Min(0)
        @Max(100)
        private int power;

        @Min(0)
        @Max(100)
        private int combat;
    }

    @Data
    public static class AppearanceDTO {
        private String gender;
        private String race;
        private List<String> height;
        private List<String> weight;
        private String eyeColor;
        private String hairColor;
    }

    @Data
    public static class BiographyDTO {
        private String fullName;
        private String alterEgos;
        private List<String> aliases;
        private String placeOfBirth;
        private String firstAppearance;
        private String publisher;
        private String alignment;
    }
}