package com.jonas.citiesapi.controllers;

import java.util.List;
import java.util.Optional;

import com.jonas.citiesapi.model.Country;
import com.jonas.citiesapi.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    public Iterable<Country> countries(){
        return countryRepository.findAll();
    }

    @GetMapping
    public Page<Country> someCountries(Pageable page){
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable long id){
        Optional<Country> findById = countryRepository.findById(id);
        return findById.get();
    }
}
