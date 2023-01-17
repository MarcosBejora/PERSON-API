	package com.api.personapi.controllers;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.personapi.dtos.PersonDto;
import com.api.personapi.models.PersonModel;
import com.api.personapi.services.PersonService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/person-api/person")
public class PersonController {

	final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping               //POST PERSON
	public ResponseEntity<Object> savePerson(@RequestBody @Valid PersonDto personDto){
		var personModel = new PersonModel();
		BeanUtils.copyProperties(personDto, personModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(personModel));
	}
	
	@GetMapping("/")           //GETALL PERSON
	public ResponseEntity<List<PersonModel>> getAllPersons(){
		return ResponseEntity.status(HttpStatus.OK).body(personService.findAll());
	}
	
	@GetMapping("/{personId}")//GETONE PERSON
	public ResponseEntity<Object> getOnePerson (@PathVariable(value = "personId") Integer personId){
		Optional<PersonModel> personOptional = personService.findById(personId);
		if(!personOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found.");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(personOptional.get());
	}
	
	@PutMapping("/{personId}")//PUT PERSON
	public ResponseEntity<Object> updatePerson (@PathVariable(value = "personId") Integer personId, @RequestBody @Valid PersonDto personDto){
		Optional<PersonModel> personOptional = personService.findById(personId);
		if(!personOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found.");
		}
		var personModel = new PersonModel();
		BeanUtils.copyProperties(personDto, personModel);
		personModel.setPersonId(personOptional.get().getPersonId());
		return ResponseEntity.status(HttpStatus.OK).body(personService.save(personModel));
	}
	
}
