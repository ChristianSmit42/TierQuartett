package de.neuefische.tierquartett.db;

import de.neuefische.tierquartett.model.Tier;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
@NoArgsConstructor
public class TierDb {

    private List<Tier> animals = new ArrayList<> (List.of(
            new Tier("Affe","male",3,false),
            new Tier("Pinguin","female",1,true),
            new Tier("Erdmännchen","male",4,true),
            new Tier("Emu","female",5,false),
            new Tier("Faultier","male",22,true),
            new Tier("Warzenschwein","female",43,false)
    ));


    public Collection<Tier> getAllAnimals() {
        return Collections.unmodifiableCollection(animals);
    }

    public Tier addAnimal(Tier animal) {
        animals.add(animal);
        return animal;
    }
}
