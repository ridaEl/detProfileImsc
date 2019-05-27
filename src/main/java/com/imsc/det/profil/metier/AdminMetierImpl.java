package com.imsc.det.profil.metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.beans.dao.AdminRepository;


@Service
@Transactional
public class AdminMetierImpl implements AdminMetier {
	@Autowired
	private AdminRepository adminRepository ;

	@Override
	public void save(Admin admin) {
		adminRepository.save(admin);
		
	}

	@Override
	public void update(Long idAdmin, Admin adm) {
		// TODO Auto-generated method stub
		Admin admin = adminRepository.findById(idAdmin).get();
		admin.setNomAdmin(adm.getNomAdmin());
		admin.setImageAdmin(adm.getImageAdmin());
		admin.setEmailAdmin(adm.getEmailAdmin());
		admin.setMotDePasseAdmin(adm.getMotDePasseAdmin());
		
		adminRepository.save(admin);
	}
	public void delete(Long idAdmin) {
		adminRepository.deleteById(idAdmin);
		}

}
