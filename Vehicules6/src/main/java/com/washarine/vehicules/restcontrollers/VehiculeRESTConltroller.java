package com.washarine.vehicules.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.washarine.vehicules.entities.Vehicule;
import com.washarine.vehicules.service.VehiculeService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class VehiculeRESTConltroller {
	@Autowired
	VehiculeService vehiculeService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Vehicule> getAllVehicules() {
	return vehiculeService.getAllVehicules();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Vehicule getVehiculeById(@PathVariable("id") Long id) {
	return vehiculeService.getVehicule(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
	return vehiculeService.saveVehicule(vehicule);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
	return vehiculeService.updateVehicule(vehicule);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVehicule(@PathVariable("id") Long id)
	{
		vehiculeService.deleteVehiculeById(id);
	}
	
	@RequestMapping(value="/vehimar/{idM}",method = RequestMethod.GET)
	public List<Vehicule> getVehiculesByMarId(@PathVariable("idM") Long idM) {
	return vehiculeService.findByMarqueIdM(idM);
	}
	
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Vehicule> getAlllVehicules() {
	return vehiculeService.getAllVehicules();
	}
	
	
}
