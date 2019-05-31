package com.imsc.det.profil.beans.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Question;
import com.imsc.det.profil.beans.metier.QuestionMetier;;
@RestController
public class QuestionRestService {

	 @Autowired
	private QuestionMetier questionmetier;
	 @RequestMapping(value="/question",method=RequestMethod.POST)
	public void save(@RequestBody Question question) {
		 questionmetier.save(question);
	}

	 @PutMapping( path="/question/{id}"  )
	 public void update(@PathVariable Long id,@RequestBody Question question) {
		
		 questionmetier.update(id, question);
		}
	 
	@DeleteMapping("/question/{id}")
	public void deleteStudent(@PathVariable Long id) {
		questionmetier.delete(id);
	}
}
