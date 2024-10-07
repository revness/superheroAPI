package io.nology.superhero.superhero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nology.superhero.superhero.entity.Superhero;
import io.nology.superhero.superhero.entity.Superhero.Biography;
import io.nology.superhero.superhero.entity.Superhero.Connections;
import io.nology.superhero.superhero.entity.embedded.Appearance;
import io.nology.superhero.superhero.entity.embedded.Images;
import io.nology.superhero.superhero.entity.embedded.Powerstats;
import io.nology.superhero.superhero.entity.embedded.Work;
import jakarta.validation.Valid;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository superheroRepository;

    public Superhero createSuperhero(@Valid CreateSuperheroDTO data) throws Exception {

        Superhero superhero = new Superhero();
        superhero.setName(data.getName());
        superhero.setSlug(data.getSlug());

        // Set Powerstats
        Powerstats powerstats = new Powerstats();
        powerstats.setIntelligence(data.getPowerstats().getIntelligence());
        powerstats.setStrength(data.getPowerstats().getStrength());
        powerstats.setSpeed(data.getPowerstats().getSpeed());
        powerstats.setDurability(data.getPowerstats().getDurability());
        powerstats.setPower(data.getPowerstats().getPower());
        powerstats.setCombat(data.getPowerstats().getCombat());
        superhero.setPowerstats(powerstats);

        // Set Appearance
        Appearance appearance = new Appearance();
        appearance.setGender(data.getAppearance().getGender());
        appearance.setRace(data.getAppearance().getRace());
        appearance.setHeight(data.getAppearance().getHeight());
        appearance.setWeight(data.getAppearance().getWeight());
        appearance.setEyeColor(data.getAppearance().getEyeColor());
        appearance.setHairColor(data.getAppearance().getHairColor());
        superhero.setAppearance(appearance);

        // Set Biography
        Biography biography = new Biography();
        biography.setFullName(data.getBiography().getFullName());
        biography.setAlterEgos(data.getBiography().getAlterEgos());
        biography.setAliases(data.getBiography().getAliases());
        biography.setPlaceOfBirth(data.getBiography().getPlaceOfBirth());
        biography.setFirstAppearance(data.getBiography().getFirstAppearance());
        biography.setPublisher(data.getBiography().getPublisher());
        biography.setAlignment(data.getBiography().getAlignment());
        superhero.setBiography(biography);

        // Set Work
        Work work = new Work();
        work.setOccupation(data.getWork().getOccupation());
        work.setBase(data.getWork().getBase());
        superhero.setWork(work);

        // Set Connections
        Connections connections = new Connections();
        connections.setGroupAffiliation(data.getConnections().getGroupAffiliation());
        connections.setRelatives(data.getConnections().getRelatives());
        superhero.setConnections(connections);

        if (data.getImages() != null) {
            Images images = new Images();
            images.setXs(data.getImages().getXs());
            images.setSm(data.getImages().getSm());
            images.setMd(data.getImages().getMd());
            images.setLg(data.getImages().getLg());
            superhero.setImages(images);
        }

        return superheroRepository.save(superhero);

    }

}
