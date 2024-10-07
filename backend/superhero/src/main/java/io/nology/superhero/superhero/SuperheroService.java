package io.nology.superhero.superhero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository superheroRepository;

    public Superhero createSuperhero(@Valid CreateSuperheroDTO data) throws Exception {

        Superhero superhero = new Superhero();
        superhero.setName(data.getName());
        superhero.setSlug(data.getSlug());
        superhero.setPowerstats(data.getPowerstats());
        superhero.setAppearance(data.getAppearance());
        superhero.setBiography(data.getBiography());
        superhero.setOccupation(data.getOccupation());
        superhero.setBase(data.getBase());
        superhero.setGroupAffiliation(data.getGroupAffiliation());
        superhero.setRelatives(data.getRelatives());

        return this.superheroRepository.save(superhero);
    }

}
