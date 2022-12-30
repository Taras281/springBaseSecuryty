package com.example.springBaseSecuryty.reposytory;


import com.example.springBaseSecuryty.model.Countres;
import org.springframework.data.repository.CrudRepository;

public interface ReposytoryCountry extends CrudRepository<Countres, Long> {
}
