package com.imsc.det.profil.beans;

import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Reponse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="idQuestion")
	
	private Long idRep;
	
	@Column(name="IntituleRep")
	private String IntituleRep;
	
	@Column(name="Score")
	private int Score;
	
	@ManyToMany
	@JoinTable(name="Question_Reponse" ,
			joinColumns = { @JoinColumn(name = "Reponse_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "Question_id") })
	private Collection<Question> questions;

	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reponse(String intituleRep, int score) {
		super();
		IntituleRep = intituleRep;
		Score = score;
	}

	public Long getIdRep() {
		return idRep;
	}

	public void setIdRep(Long idRep) {
		this.idRep = idRep;
	}

	public String getIntituleRep() {
		return IntituleRep;
	}

	public void setIntituleRep(String intituleRep) {
		IntituleRep = intituleRep;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}
	
	
}
