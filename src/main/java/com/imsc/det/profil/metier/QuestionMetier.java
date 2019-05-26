package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Question;

public interface QuestionMetier {
	public void save(Question qst);
	public void update(Long idQuestion,Question qst);
	public void delete(Long idQuestion,Question qst);
}
