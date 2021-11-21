package com.washarine.vehicules.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.washarine.vehicules.entities.Marque;
import com.washarine.vehicules.entities.Vehicule;


public interface VehiculeService {
	Vehicule saveVehicule(Vehicule vh);
	Vehicule updateVehicule(Vehicule vh);
	void deleteVehicule(Vehicule vh);
	 void deleteVehiculeById(Long id);
	 Vehicule getVehicule(Long id);
	List<Vehicule> getAllVehicules();
	List<Vehicule> findByNomVehicule(String nom);
	List<Vehicule> findByNomVehiculeContains(String nom);
	List<Vehicule> findByNomPrix (String nom, Double prix);
	List<Vehicule> findByMarque (Marque categorie);
	List<Vehicule> findByMarqueIdM(Long id);
	List<Vehicule> findByOrderByNomVehiculeAsc();
	List<Vehicule> trierVehiculesNomsPrix();

}
