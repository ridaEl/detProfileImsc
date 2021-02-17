package com.imsc.det.profil.beans.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Test;
import com.imsc.det.profil.beans.metier.TestMetier;
@RestController
public class TestRestServices {

	 @Autowired
	private TestMetier testMetier;
	 @RequestMapping(value="/test",method=RequestMethod.POST)
	public void save(@RequestBody Test test) {
		 testMetier.save(test);
	}

	 @PutMapping( path="/test/{id}"  )
	 public void update(@PathVariable Long id,@RequestBody Test test) {
		
		 testMetier.update(id, test);
		}
	 
	@DeleteMapping("/test/{id}")
	public void deleteStudent(@PathVariable Long id) {
		testMetier.delete(id);
	}

}
