package com.imsc.det.profil.beans.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imsc.det.profil.beans.Reponse;
import com.imsc.det.profil.beans.dao.ReponseRepository;
@Service
@Transactional
public class ReponseMetierImpl implements ReponseMetier{
	@Autowired
	ReponseRepository reponseRepository;

	@Override
	public void save(Reponse rep) {
		reponseRepository.save(rep);		
	}

	@Override
	public void update(Long idRep, Reponse rep) {
		Reponse reponse =reponseRepository.findById(idRep).get();
		reponse.setIntituleRep(rep.getIntituleRep());
		reponse.setQuestions(rep.getQuestions());
		reponse.setScore(rep.getScore());
		reponseRepository.save(reponse);
	}

	@Override
	public void delete(Long idRep) {
		reponseRepository.deleteById(idRep);		
	}

}
