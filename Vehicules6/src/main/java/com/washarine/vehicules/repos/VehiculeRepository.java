package com.washarine.vehicules.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.washarine.vehicules.entities.Marque;
import com.washarine.vehicules.entities.Vehicule;


@RepositoryRestResource(path ="rest")
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
	List<Vehicule> findByNomVehicule(String nom);
	List<Vehicule> findByNomVehiculeContains(String nom);
	/*@Query("select vh from Vehicule vh where vh.nomVehicule like %?1 and vh.prixVehicule > ?2")
	List<Vehicule> findByNomPrix (String nom, Double prix);*/
	
	@Query("select vh from Vehicule vh where vh.nomVehicule like %:nom and vh.prixVehicule > :prix")
	List<Vehicule> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select vh from Vehicule vh where vh.marque = ?1")
	List<Vehicule> findByMarque (Marque marque);
	List<Vehicule> findByMarqueIdM(Long id);
	List<Vehicule> findByOrderByNomVehiculeAsc();

	@Query("select vh from Vehicule vh order by vh.nomVehicule ASC, vh.prixVehicule DESC")
	List<Vehicule> trierVehiculesNomsPrix ();

}
