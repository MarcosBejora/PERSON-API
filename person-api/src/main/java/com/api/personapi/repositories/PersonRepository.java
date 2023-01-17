package com.api.personapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.personapi.models.PersonModel;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Integer> {}
