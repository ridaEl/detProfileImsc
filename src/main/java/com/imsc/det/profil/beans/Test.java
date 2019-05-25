package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Test implements Serializable  {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long idTest ;
	   private String intitule ;
	   private String   imageAdmin ;
	   @ManyToOne
	   @JoinColumn(name="id_Admin")
	   private Admin admin ;
	   @ManyToMany
	   @JoinTable(name="Test_Categorie" ,
			    joinColumns = { @JoinColumn(name = "Test_id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "Categorie_id") }
			   )
	   private Collection <Categorie> categories ;
	   
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
	public Collection<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Categorie> categories) {
		this.categories = categories;
	}
	
	   
	   
}
