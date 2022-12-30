package com.example.springBaseSecuryty.reposytory;

import com.example.springBaseSecuryty.model.Cities;
import org.springframework.data.repository.CrudRepository;

public interface Reposytory extends CrudRepository<Cities, Long> {
}
