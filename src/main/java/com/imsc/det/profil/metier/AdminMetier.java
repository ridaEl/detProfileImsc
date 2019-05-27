package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.beans.Categorie;
import com.imsc.det.profil.beans.Question;
import com.imsc.det.profil.beans.Reponse;
import com.imsc.det.profil.beans.Test;

public interface AdminMetier {
	public void save(Admin admin);
	public void update(Long idAdmin,Admin adm);
	public void delete(Long idAdmin);
	
}
