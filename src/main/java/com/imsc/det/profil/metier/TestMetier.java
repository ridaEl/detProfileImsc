package com.imsc.det.profil.metier;

import com.imsc.det.profil.beans.Test;

public interface TestMetier {
	public void save(Test test);
	public void update(Long idTest,Test test);
	public void delete(Long idTest,Test test);
}
