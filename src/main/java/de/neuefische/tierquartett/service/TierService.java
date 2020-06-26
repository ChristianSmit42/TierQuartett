package de.neuefische.tierquartett.service;

import de.neuefische.tierquartett.db.TierDbMongo;
import de.neuefische.tierquartett.model.Tier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class TierService {
    private final TierDbMongo animals;

    public Iterable<Tier> getAllAnimals() {
        return animals.findAll();
    }

    public Tier addAnimal(Tier animal) {
        return animals.save(animal);
    }
}
