package de.neuefische.tierquartett.controller;
import de.neuefische.tierquartett.db.TierDb;
import de.neuefische.tierquartett.model.Tier;
import de.neuefische.tierquartett.service.TierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("animals")
public class TierController {
     private final TierService animalService;

    @GetMapping
    public List<Tier> getAllAnimals(){
        return animalService.getAllAnimals();
    }

}
