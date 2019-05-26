package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Admin;

public interface AdminMetier {
	public void save(Admin admin);
	public void update(Long idAdmin,Admin adm);
	public void delete(Long idAdmin,Admin adm);
}
