package com.imsc.det.profil.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Question implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idQuestion")
	private Long idQuest;
	
	@Column(name="Intitule")
	private String IntituleQuest;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie Cat;
	
	@ManyToMany(mappedBy = "questions")
	 @JoinTable(name="Question_Reponse" ,
	    joinColumns = { @JoinColumn(name = "Question_id") }, 
     inverseJoinColumns = { @JoinColumn(name = "Reponse_id") }
	   )
	private Collection<Reponse> reponses;
	
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
	public Collection<Reponse> getReponses() {
		return reponses;
	}
	public void setReponses(Collection<Reponse> reponses) {
		this.reponses = reponses;
	}

}
