package com.imsc.det.profil.beans.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imsc.det.profil.beans.Test;
import com.imsc.det.profil.beans.dao.TestRepository;
@Service
@Transactional
public class TestMetierImpl implements TestMetier{
	@Autowired
	private TestRepository testRepository ;
	@Override
	public void save(Test test) {
		testRepository.save(test);		
	}

	@Override
	public void update(Long idTest, Test test) {
		Test testUp = testRepository.findById(idTest).get();
		testUp.setAdmin(test.getAdmin());
		testUp.setCategories(test.getCategories());
		testUp.setIntitule(test.getIntitule());
		testRepository.save(testUp);		
	}

	@Override
	public void delete(Long idTest) {
		testRepository.deleteById(idTest);		
	}

}
