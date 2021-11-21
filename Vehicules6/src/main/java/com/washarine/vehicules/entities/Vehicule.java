package com.washarine.vehicules.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Vehicule {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idVehicule;
private String nomVehicule;
private Double prixVehicule;
private Date dateCreation;
@ManyToOne
private Marque marque;
public Vehicule() {
super();
}
public Vehicule(String nomVehicule, Double prixVehicule, Date dateCreation) {
super();
this.nomVehicule = nomVehicule;
this.prixVehicule = prixVehicule;
this.dateCreation = dateCreation;
}
public Long getIdVehicule() {
	return idVehicule;
	}
	public void setIdVehicule(Long idVehicule) {
	this.idVehicule = idVehicule;
	}
	public String getNomVehicule() {
	return nomVehicule;
	}
	public void setNomVehicule(String nomVehicule) {
	this.nomVehicule = nomVehicule;
	}
	public Double getPrixVehicule() {
	return prixVehicule;
	}
	public void setPrixVehicule(Double prixVehicule) {
	this.prixVehicule = prixVehicule;
	}
	public Date getDateCreation() {
	return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
	return "Vehicule [idVehicule=" + idVehicule + ", nomVehicule=" + 
	nomVehicule + ", prixVehicule=" + prixVehicule
	+ ", dateCreation=" + dateCreation  + "]";
	}
	}
