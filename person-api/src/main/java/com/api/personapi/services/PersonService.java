package com.api.personapi.services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.api.personapi.models.PersonModel;
import com.api.personapi.repositories.PersonRepository;

@Service
public class PersonService {

	final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Transactional
	public PersonModel save(PersonModel personModel) {
		return personRepository.save(personModel);
	}

	public List<PersonModel> findAll() {
		return personRepository.findAll();
	}

	public Optional<PersonModel> findById(Integer personId) {
		return personRepository.findById(personId);
	}
}
