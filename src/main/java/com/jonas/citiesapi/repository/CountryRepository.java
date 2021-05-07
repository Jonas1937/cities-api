package com.jonas.citiesapi.repository;

import com.jonas.citiesapi.model.Country;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
    
}
