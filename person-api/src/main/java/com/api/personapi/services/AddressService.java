package com.api.personapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.personapi.models.AddressModel;
import com.api.personapi.repositories.AddressRepository;

@Service
public class AddressService {

	final AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	
	@Transactional
	public AddressModel save(AddressModel addressModel) {
		return addressRepository.save(addressModel);
	}

	public List<AddressModel> findAll() {
		return addressRepository.findAll();
	}

	public Optional<AddressModel> findById(Integer addressId) {
		return addressRepository.findById(addressId);
	}


}