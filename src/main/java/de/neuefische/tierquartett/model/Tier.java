package de.neuefische.tierquartett.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "animals")
public class Tier {
    @Id
    private String Id;
    private String name;
    private String gender;
    private int age;
    private boolean cute;
}
