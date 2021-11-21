package com.washarine.vehicules.entities;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idM;
	private String nomM;
	private String descriptionM;
	
	@JsonIgnore
	@OneToMany (mappedBy="marque")
	private List<Vehicule> vehicules;


	public Marque( String nomM, String descriptionM, List<Vehicule> vehicules) {
		super();
	
		this.nomM = nomM;
		this.descriptionM = descriptionM;
		this.vehicules = vehicules;
	}


	public Long getIdM() {
		return idM;
	}

	public void setIdM(Long idM) {
		this.idM = idM;
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public String getDescriptionM() {
		return descriptionM;
	}

	public void setDescriptionM(String descriptionM) {
		this.descriptionM = descriptionM;
	}

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

}
