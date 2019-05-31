package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Categorie implements Serializable  {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idCat ;
	    private String intituleCat;
	    
	    @ManyToMany(mappedBy="categories")
	    private Collection <Test> tests;
	    
	    @OneToMany(mappedBy="Cat",fetch=FetchType.LAZY)
	    private Collection <Question> questions;
	    
		public Categorie() {
			super();
		}

		public Categorie(String intituleCat) {
			super();
			intituleCat = intituleCat;
		}

		public Long getIdCat() {
			return idCat;
		}

		public void setIdCat(Long idCat) {
			this.idCat = idCat;
		}

			

		public String getIntituleCat() {
			return intituleCat;
		}

		public void setIntituleCat(String intituleCat) {
			this.intituleCat = intituleCat;
		}

		public Collection<Test> getTests() {
			return tests;
		}

		public void setTests(Collection<Test> tests) {
			this.tests = tests;
		}

		public Collection<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(Collection<Question> questions) {
			this.questions = questions;
		}
	    
		
	    
	 
}
