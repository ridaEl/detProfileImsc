package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Reponse;

public interface ReponseMetier {
	public void save(Reponse rep);
	public void update(Long idRep,Reponse rep);
	public void delete(Long idRep,Reponse rep);
}
