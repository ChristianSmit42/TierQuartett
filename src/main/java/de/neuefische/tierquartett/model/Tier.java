package de.neuefische.tierquartett.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tier {
    private String name;
    private String gender;
    private int age;
    private boolean cute;
}
