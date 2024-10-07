package io.nology.superhero.superhero;

import lombok.Data;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Data
public class CreateSuperheroDTO {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Slug is required")
    private String slug;

    @Valid
    @NotNull(message = "Powerstats are required")
    private PowerstatsDTO powerstats;

    @Valid
    @NotNull(message = "Appearance is required")
    private AppearanceDTO appearance;

    @Valid
    @NotNull(message = "Biography is required")
    private BiographyDTO biography;

    @Valid
    @NotNull(message = "Work is required")
    private WorkDTO work;

    @Valid
    @NotNull(message = "Connections are required")
    private ConnectionsDTO connections;

    private ImagesDTO images;

    @Data
    public static class PowerstatsDTO {
        private int intelligence;
        private int strength;
        private int speed;
        private int durability;
        private int power;
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

    @Data
    public static class WorkDTO {
        private String occupation;
        private String base;
    }

    @Data
    public static class ConnectionsDTO {
        private String groupAffiliation;
        private String relatives;
    }

    @Data
    public static class ImagesDTO {
        private String xs;
        private String sm;
        private String md;
        private String lg;
    }
}