package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Question implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idQuestion")
	private Long idQuest;
	@Column(name="Intitule")
	private String IntituleQuest;
	@ManyToOne
	@JoinTable(name="Categorie")
	private Categorie Cat;
	@ManyToMany
	@JoinTable(name="Reponse")
	private Set<Reponse> reponses;
	
	public Question(String intituleQuest, Categorie cat) {
		super();
		IntituleQuest = intituleQuest;
		Cat = cat;
	}
	public Question() {
		super();
	}
	public Long getIdQuest() {
		return idQuest;
	}
	public void setIdQuest(Long idQuest) {
		this.idQuest = idQuest;
	}
	public String getIntituleQuest() {
		return IntituleQuest;
	}
	public void setIntituleQuest(String intituleQuest) {
		IntituleQuest = intituleQuest;
	}
	public Categorie getCat() {
		return Cat;
	}
	public void setCat(Categorie cat) {
		Cat = cat;
	}
	public Set<Reponse> getReponses() {
		return reponses;
	}
	public void setReponses(Set<Reponse> reponses) {
		this.reponses = reponses;
	}

}
