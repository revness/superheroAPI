package io.nology.superhero.superhero.entity.embedded;

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
public class Powerstats {
    private int intelligence;
    private int strength;
    private int speed;
    private int durability;
    private int power;
    private int combat;
}