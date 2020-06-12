package de.neuefische.tierquartett.service;

import de.neuefische.tierquartett.db.TierDb;
import de.neuefische.tierquartett.model.Tier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class TierService {
    private final TierDb animalDb;

    public List<Tier> getAllAnimals() {
        return new ArrayList<>(animalDb.getAllAnimals());
    }
}
