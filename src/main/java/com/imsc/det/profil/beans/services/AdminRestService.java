package com.imsc.det.profil.beans.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.beans.metier.AdminMetier;

@RestController
public class AdminRestService {
	

	 @Autowired
	private AdminMetier adminmetier;
	 @RequestMapping(value="/admin",method=RequestMethod.POST)
	public void save(@RequestBody Admin admin) {
		adminmetier.save(admin);
	}

	 @PutMapping( path="/admin/{id}"  )
	 public void update(@PathVariable Long id,@RequestBody Admin adm) {
		
			adminmetier.update(id, adm);
		}
	 
	@DeleteMapping("/admin/{id}")
	public void deleteStudent(@PathVariable Long id) {
		adminmetier.delete(id);
	}

}
