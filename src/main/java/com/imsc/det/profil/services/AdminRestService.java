package com.imsc.det.profil.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.metier.*;

@RestController
public class AdminRestService {
	@Autowired
	private AdminMetier adminmetier;
    @RequestMapping(value="/admins",method=RequestMethod.POST)
	public void save(Admin admin) {
		adminmetier.save(admin);
	}
    @RequestMapping(method = RequestMethod.PUT,value="/update/admin/{id}/{admin}")
	public void update(Long idAdmin, Admin adm) {
		adminmetier.update(idAdmin, adm);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/admin/{id}")
	public void delete(Long idAdmin, Admin adm) {
		adminmetier.delete(idAdmin, adm);
	}
}
