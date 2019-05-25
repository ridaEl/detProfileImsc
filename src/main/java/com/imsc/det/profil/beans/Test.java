package com.imsc.det.profil.beans;

import java.util.Collection;
import java.util.Set;

public class Test {
	   private Long idTest ;
	   private String intitule ;
	   private String  imageAdmin ;
	   private Admin admin ;
	   private Collection <Categorie> categorie ;
	   
	public Test() {
		super();
	}
	public Test(String intitule, String imageAdmin, Admin admin) {
		super();
		this.intitule = intitule;
		this.imageAdmin = imageAdmin;
		this.admin = admin;
	}
	public Long getIdTest() {
		return idTest;
	}
	public void setIdTest(Long idTest) {
		this.idTest = idTest;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getImageAdmin() {
		return imageAdmin;
	}
	public void setImageAdmin(String imageAdmin) {
		this.imageAdmin = imageAdmin;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Collection<Categorie> getCategorie() {
		return categorie;
	}
	public void setCategorie(Collection<Categorie> categorie) {
		this.categorie = categorie;
	}
	   
	   
}
