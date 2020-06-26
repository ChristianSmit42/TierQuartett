package de.neuefische.tierquartett.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tier {
    @Id
    private String Id;
    private String name;
    private String gender;
    private int age;
    private boolean cute;
}
