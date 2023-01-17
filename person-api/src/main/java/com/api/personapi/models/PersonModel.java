package com.api.personapi.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class PersonModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	
	@Column(nullable = false, length = 130)
	private String nome;
	
	@Column(nullable = false)
	private String birthDate;
	
	@OneToMany(mappedBy = "personModel")
	private List<AddressModel> addressModels;
	
}
