package com.washarine.vehicules;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.washarine.vehicules.entities.Marque;
import com.washarine.vehicules.entities.Vehicule;
import com.washarine.vehicules.repos.VehiculeRepository;





@SpringBootTest
class VehiculesApplicationTests {
	@Autowired
	private VehiculeRepository vehiculeRepository;

	@Test
	public void testCreateVehicule() {
		Vehicule prod = new Vehicule("Velo",720.0,new Date());
		vehiculeRepository.save(prod);
	}

	@Test
	public void testFindVehicule()
	{
		Vehicule vh = vehiculeRepository.findById(13L).get(); 
	System.out.println(vh);
	}
	
	@Test
	public void testUpdateVehicule()
	{
	Vehicule vh = vehiculeRepository.findById(13L).get();
	vh.setPrixVehicule(560800.0);
	vh.setNomVehicule("Train");
	vehiculeRepository.save(vh);
	}
	
	@Test
	public void testDeleteVehicule()
	{
		vehiculeRepository.deleteById(12L);;
	}

	
	@Test
	public void testListerTousVehicule()
	{
	List<Vehicule> vhs = vehiculeRepository.findAll();
	for (Vehicule vh : vhs)
	{
	System.out.println(vh);
	}
	}
	
	@Test
	public void testFindByNomVehicule()
	{
		List<Vehicule> vhs = vehiculeRepository.findByNomVehicule("Velo");
		for (Vehicule vh : vhs)
	{
				System.out.println(vh);
	}
	}
	@Test
		public void testFindByNomProduitContains ()
	{
		List<Vehicule> vhs=vehiculeRepository.findByNomVehiculeContains("V");
		for (Vehicule vh : vhs)
	{
				System.out.println(vh);
	} }
	
	@Test
		public void testfindByNomPrix()
	{
		List<Vehicule> vhs = vehiculeRepository.findByNomPrix("Voiture", 500.5);
		for (Vehicule vh : vhs)
	{
				System.out.println(vh);
	}
	}
	
	@Test
	public void testfindByMarque()
	{
		Marque m = new Marque();
		m.setIdM(1L);
		List<Vehicule> vhs = vehiculeRepository.findByMarque(m);
		for (Vehicule vh : vhs)
	{
				System.out.println(vh);
	}
	}
	
	@Test
	public void findByMarqueIdM()
	{
	List<Vehicule> vhs = vehiculeRepository.findByMarqueIdM(2L);
	for (Vehicule vh : vhs)
	{
	System.out.println(vh);
	}
	 }
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
		List<Vehicule> vhs = vehiculeRepository.findByOrderByNomVehiculeAsc();
		for (Vehicule vh : vhs)
	{
			System.out.println(vh);
	}
	}
	
	@Test
	public void testTrierVehiculesNomsPrix()
	{
	List<Vehicule> vhs = vehiculeRepository.trierVehiculesNomsPrix();
	for (Vehicule vh : vhs)
	{
	System.out.println(vh);
	}
	}



	


}
