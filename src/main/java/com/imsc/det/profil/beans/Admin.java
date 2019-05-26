package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin   implements Serializable   {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long idAdmin ;
   private String nomAdmin ;
   private String imageAdmin ;
   private String motDePasseAdmin ;
   private String emailAdmin ;
   @OneToMany(mappedBy="admin")
   private Collection <Test> tests ; 
   	public Admin() {
	super();
   	}
public Admin(String nomAdmin, String imageAdmin, String motDePasseAdmin, String emailAdmin) {
	super();
	this.nomAdmin = nomAdmin;
	this.imageAdmin = imageAdmin;
	this.motDePasseAdmin = motDePasseAdmin;
	this.emailAdmin = emailAdmin;
}
public Long getIdAdmin() {
	return idAdmin;
}
public void setIdAdmin(Long idAdmin) {
	this.idAdmin = idAdmin;
}
public String getNomAdmin() {
	return nomAdmin;
}
public void setNomAdmin(String nomAdmin) {
	this.nomAdmin = nomAdmin;
}
public String getImageAdmin() {
	return imageAdmin;
}
public void setImageAdmin(String imageAdmin) {
	this.imageAdmin = imageAdmin;
}
public String getMotDePasseAdmin() {
	return motDePasseAdmin;
}
public void setMotDePasseAdmin(String motDePasseAdmin) {
	this.motDePasseAdmin = motDePasseAdmin;
}
public String getEmailAdmin() {
	return emailAdmin;
}
public void setEmailAdmin(String emailAdmin) {
	this.emailAdmin = emailAdmin;
}
public Collection<Test> getTests() {
	return tests;
}
public void setTests(Collection<Test> tests) {
	this.tests = tests;
}
    
  
}
