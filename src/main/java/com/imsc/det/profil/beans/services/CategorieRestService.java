package com.imsc.det.profil.beans.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Categorie;
import com.imsc.det.profil.beans.metier.CategorieMetier;;

@RestController
public class CategorieRestService {
	 @Autowired
	private CategorieMetier categorieMetier;
	 @RequestMapping(value="/categorie",method=RequestMethod.POST)
	public void save(@RequestBody Categorie categorie) {
		 categorieMetier.save(categorie);
	}

	 @PutMapping( path="/categorie/{id}"  )
	 public void update(@PathVariable Long id,@RequestBody Categorie categorie) {
		
		 categorieMetier.update(id, categorie);
		}
	 
	@DeleteMapping("/categorie/{id}")
	public void deleteStudent(@PathVariable Long id) {
		categorieMetier.delete(id);
	}
	
	@RequestMapping(value="/categories", method = RequestMethod.GET)
	public List<Categorie> findAll() {
		return categorieMetier.listeCategories();
	}
}
