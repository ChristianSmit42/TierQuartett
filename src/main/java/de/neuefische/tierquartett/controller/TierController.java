package de.neuefische.tierquartett.controller;
import de.neuefische.tierquartett.model.Tier;
import de.neuefische.tierquartett.service.TierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("animals")
public class TierController {
     private final TierService animalService;

    @GetMapping
    public Iterable<Tier> getAllAnimals(){
        return animalService.getAllAnimals();
    }

    @PutMapping
    public Tier addAnimal(@RequestBody Tier animal){
        return animalService.addAnimal(animal);
    }

}
