package com.example.springbootappp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Studentable {
    @Id
    private int reg;
    private String name;
    private int mark;
}
