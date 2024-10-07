package io.nology.superhero.superhero.entity.embedded;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appearance {
    private String gender;
    private String race;

    @ElementCollection
    private List<String> height;

    @ElementCollection
    private List<String> weight;

    private String eyeColor;
    private String hairColor;

}