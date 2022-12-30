package com.example.springBaseSecuryty.controller;

public class CountresModel {

    CountresModel(){
        id=101;
        name="Kaliningradik";
        population=67000;
        gdp =56;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    private String name;
    private int population;
    private int gdp;
}

