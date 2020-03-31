package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entity.Training;
import org.sid.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * API REST : Pour gérer des formations, 
 * 			  basée sur Spring Data REST
 * 
 */
public class TrainingRestController {
	
	@Autowired
	private TrainingRepository trainingRepository;
	
	@GetMapping("/trainings") 
	public List<Training> getTrainings() {
		return trainingRepository.findAll();
	}
	
	@GetMapping("/trainings/{id}")
	public Optional<Training> getTraining(@PathVariable(name = "id") Long id) {
		return trainingRepository.findById(id);
	}
	
	@PostMapping("/trainings")
	public Training save(@RequestBody Training training) {
		return trainingRepository.save(training);
	}
	
	@PutMapping("/trainings/{id}")
	public Training update(@PathVariable(name = "id") Long id, @RequestBody Training training) {
		training.setId(id);
		return trainingRepository.save(training);
	}
	
	@DeleteMapping("/trainings/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		
	}

}
