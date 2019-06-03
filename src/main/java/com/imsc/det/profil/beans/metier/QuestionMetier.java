package com.imsc.det.profil.beans.metier;

import java.util.List;

import com.imsc.det.profil.beans.Categorie;
import com.imsc.det.profil.beans.Question;

public interface QuestionMetier {
	public void save(Question qst);
	public void update(Long idQuestion,Question qst);
	public void delete(Long idQuestion);
	public List<Question> listeQuestions();
	public List<Question> getlisteQuestionParCategorie(Long idCategorie);
}
