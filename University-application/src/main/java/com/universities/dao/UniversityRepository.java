package com.universities.dao;

import org.springframework.data.repository.CrudRepository;

import com.universities.entities.University;

public interface UniversityRepository extends CrudRepository<University, Integer> {

}
