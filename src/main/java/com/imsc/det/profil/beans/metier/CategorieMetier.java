package com.imsc.det.profil.beans.metier;

import java.util.List;

import com.imsc.det.profil.beans.Categorie;

public interface CategorieMetier {
	public void save(Categorie cat);
	public void update(Long idCat,Categorie cat);
	public void delete(Long idCat);
	public List<Categorie> listeCategories();
}
