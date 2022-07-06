package com.cricket.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cricket.mode.CricketPlayers;
import com.cricket.repository.PlayersRepository;




@CrossOrigin()
@RestController
@RequestMapping("/api")
public class PlayersController {


	@Autowired
	PlayersRepository playersRepository;

	@GetMapping("/players")
	public List<CricketPlayers> retriveAllStudents(){
		return playersRepository.findAll();
	}
	@GetMapping("/players/{id}")
	public  CricketPlayers retriveStudent(@PathVariable long id) {
		Optional<CricketPlayers> playersOptional = playersRepository.findById(id);
		return null;
}
	@DeleteMapping("/players/{id}")
	public void deleteStudent(@PathVariable long id) {
		playersRepository.deleteById(id);
	}
	
	@PostMapping("/players")
	public ResponseEntity<Object> createStudent(@RequestBody CricketPlayers cricketPlayers){
		CricketPlayers savedPlayers= playersRepository.save(cricketPlayers);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedPlayers.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody CricketPlayers player,@PathVariable long id){
		Optional<CricketPlayers> playersOptional = playersRepository.findById(id);
		
		if (!playersOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		player.setId(id);
		playersRepository.save(player);
		return ResponseEntity.noContent().build();
	}
	
	}
