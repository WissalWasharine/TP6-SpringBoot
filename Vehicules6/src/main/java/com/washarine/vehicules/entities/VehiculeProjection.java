package com.washarine.vehicules.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomVeh", types = { Vehicule.class })
public interface VehiculeProjection {
	public String getNomVehicule();
}
