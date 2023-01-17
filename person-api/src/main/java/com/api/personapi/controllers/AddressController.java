package com.api.personapi.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.personapi.dtos.AddressDto;
import com.api.personapi.models.AddressModel;
import com.api.personapi.services.AddressService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/person-api/address")
public class AddressController {
	
	final AddressService addressService;

	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@PostMapping      //POST ADDRESS
	public ResponseEntity<Object> saveAddress(@RequestBody @Valid AddressDto addressDto){
		var addressModel = new AddressModel();
		BeanUtils.copyProperties(addressDto, addressModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(addressService.save(addressModel));
		
	}
	
	@GetMapping("/")  //GETALL ADDRESS
	public ResponseEntity<List<AddressModel>> getAllAddress(){
		return ResponseEntity.status(HttpStatus.OK).body(addressService.findAll());
	}

}
