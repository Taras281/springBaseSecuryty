package com.example.springBaseSecuryty.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Countres {
    @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int population;
    private int gdp;
}
