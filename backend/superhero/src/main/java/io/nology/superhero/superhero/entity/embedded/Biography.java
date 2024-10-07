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
public class Biography {
    private String fullName;
    private String alterEgos;

    @ElementCollection
    private List<String> aliases;

    private String placeOfBirth;
    private String firstAppearance;
    private String publisher;
    private String alignment;

}