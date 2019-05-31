package com.imsc.det.profil.beans.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.imsc.det.profil.beans.Reponse;

import com.imsc.det.profil.beans.metier.ReponseMetier;
@RestController
public class ReponseRestService {
	 @Autowired
		private ReponseMetier reponseMetier;
		 @RequestMapping(value="/reponse",method=RequestMethod.POST)
		public void save(@RequestBody Reponse reponse) {
			 reponseMetier.save(reponse);
		}

		 @PutMapping( path="/reponse/{id}"  )
		 public void update(@PathVariable Long id,@RequestBody Reponse reponse) {
			
			 reponseMetier.update(id, reponse);
			}
		 
		@DeleteMapping("/reponse/{id}")
		public void deleteStudent(@PathVariable Long id) {
			reponseMetier.delete(id);
		}
}
