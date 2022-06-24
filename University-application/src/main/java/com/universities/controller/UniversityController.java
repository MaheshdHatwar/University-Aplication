package com.universities.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universities.Exception.Hand.UniversityNotFoundException;
import com.universities.dao.UniversityRepository;
import com.universities.entities.University;

@RestController
public class UniversityController {

	private final UniversityRepository universityRepository;

	public UniversityController(UniversityRepository universityRepository) {

		this.universityRepository = universityRepository;
	}
	@GetMapping("/universities")
	List<University> all(){
		return (List<University>) universityRepository.findAll();
	}
	
	@PostMapping
	University newUniversity(@RequestBody University newUniversity) {
		return universityRepository.save(newUniversity);
	}
	
	@GetMapping("/universities/{id}")
	University one(@PathVariable int id)
	{
		return universityRepository.findById(id).orElseThrow(()->new UniversityNotFoundException(id));
	}
	@PutMapping
	Optional<Object> replaceUniversity(@RequestBody University newUniversity,@PathVariable int id)
	{
		return universityRepository.findById(id).map(university->{university.setId(newUniversity.getId());
		university.setName(newUniversity.getName());
		university.setTotalNum(newUniversity.getTotalNum());
		return universityRepository.save(university);
		});
	}
	
	@DeleteMapping("/universities/{id}")
	void deleteUniversity(@PathVariable int id) {
		universityRepository.deleteById(id);
	}
	
	
}
