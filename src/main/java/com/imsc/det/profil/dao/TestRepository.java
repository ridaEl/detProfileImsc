package com.imsc.det.profil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imsc.det.profil.beans.Test;

public interface TestRepository extends JpaRepository<Test,Long> {

}
