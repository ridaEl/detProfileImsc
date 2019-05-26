package com.imsc.det.profil.metier;
import com.imsc.det.profil.dao.AdminRepository;

import com.imsc.det.profil.beans.Admin;

public class AdminMetierImpl implements AdminMetier {
	
	private AdminRepository AdminRepository;
	@Override
	public void save(Admin admin) {
		 AdminRepository.save(admin);
		
	}

	@Override
	public void update(Long idAdmin, Admin adm) {
		// TODO Auto-generated method stub
		Admin admin = AdminRepository.findById(idAdmin).get();
		admin.setNomAdmin(adm.getNomAdmin());
		admin.setImageAdmin(adm.getImageAdmin());
		admin.setEmailAdmin(adm.getEmailAdmin());
		admin.setMotDePasseAdmin(adm.getMotDePasseAdmin());
		
		AdminRepository.save(admin);
	}

	@Override
	public void delete(Long idAdmin, Admin adm) {
		AdminRepository.deleteById(idAdmin);
		
	}

}
