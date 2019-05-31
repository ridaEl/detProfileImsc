package com.imsc.det.profil.beans.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imsc.det.profil.beans.Question;
import com.imsc.det.profil.beans.dao.QuestionRepository;
@Service
@Transactional
public class QuestionMetierImpl implements QuestionMetier{
	@Autowired
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
	public void delete(Long idQuestion) {
		// TODO Auto-generated method stub
		QuestionRepository.deleteById(idQuestion);
	}

}
