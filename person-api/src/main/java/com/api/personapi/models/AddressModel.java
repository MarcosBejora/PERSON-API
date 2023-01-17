package com.api.personapi.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class AddressModel implements Serializable{
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	@Column(nullable = false)
	private String logradouro;
	@Column(nullable = false)
	private String numero;
	@Column(nullable = false)
	private String cep;
	@Column(nullable = false)
	private String cidade;
	@ManyToOne
	@JoinColumn(nullable = false)
	private PersonModel personModel;

}