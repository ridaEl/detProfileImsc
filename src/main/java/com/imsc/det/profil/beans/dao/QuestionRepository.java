package com.imsc.det.profil.beans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imsc.det.profil.beans.Question;

public interface QuestionRepository  extends JpaRepository<Question,Long>  {

}
