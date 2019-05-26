package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Question;
import com.imsc.det.profil.dao.QuestionRepository;

public class QuestionMetierImpl implements QuestionMetier{

	private QuestionRepository QuestionRepository;
	@Override
	public void save(Question qst) {
		// TODO Auto-generated method stub
		 QuestionRepository.save(qst);
		
	}

	@Override
	public void update(Long idQuestion, Question qst) {
		// TODO Auto-generated method stub
		Question question = QuestionRepository.findById(idQuestion).get();
		question.setIntituleQuest(qst.getIntituleQuest());
		question.setCat(qst.getCat());
		question.setReponses(qst.getReponses());
		
		QuestionRepository.save(question);
		
	}

	@Override
	public void delete(Long idQuestion, Question qst) {
		// TODO Auto-generated method stub
		QuestionRepository.deleteById(idQuestion);
	}

}
