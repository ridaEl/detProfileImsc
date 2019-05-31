package com.imsc.det.profil.beans.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imsc.det.profil.beans.Categorie;
import com.imsc.det.profil.beans.dao.CategorieRepository;
@Service
@Transactional
public class CategorieMetierImpl implements CategorieMetier {

	@Autowired
	private CategorieRepository categorieRepository ;
	@Override
	public void save(Categorie cat) {
		categorieRepository.save(cat);		
	}

	@Override
	public void update(Long idCat, Categorie cat) {
		Categorie categorie =categorieRepository.findById(idCat).get() ;
		categorie.setIntituleCat(cat.getIntituleCat());
		categorie.setQuestions(cat.getQuestions());
		categorie.setTests(cat.getTests());
		categorieRepository.save(categorie);
		
	}

	@Override
	public void delete(Long idCat) {
					categorieRepository.deleteById(idCat);
	}
	
}
