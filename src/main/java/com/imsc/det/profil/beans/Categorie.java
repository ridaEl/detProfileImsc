package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Categorie implements Serializable  {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idCat;
	    private String IntituleCat;
	    
	    @ManyToMany
	    private Collecion <Test> tests;
	    
	    @OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	    private Collecion <Question> questions;
	    
		public Categorie() {
			super();
		}

		public Categorie(String intituleCat) {
			super();
			IntituleCat = intituleCat;
		}

		public Long getIdCat() {
			return idCat;
		}

		public void setIdCat(Long idCat) {
			this.idCat = idCat;
		}

		public String getIntituleCat() {
			return IntituleCat;
		}

		public void setIntituleCat(String intituleCat) {
			IntituleCat = intituleCat;
		}

		public Collecion<Test> getTests() {
			return tests;
		}

		public void setTests(Collecion<Test> tests) {
			this.tests = tests;
		}

		public Collecion<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(Collecion<Question> questions) {
			this.questions = questions;
		}
	    
		
	    
	 
}
