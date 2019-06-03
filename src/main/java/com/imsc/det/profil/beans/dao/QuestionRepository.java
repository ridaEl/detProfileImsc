package com.imsc.det.profil.beans.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imsc.det.profil.beans.Question;

public interface QuestionRepository  extends JpaRepository<Question,Long>  {

	
	@Query(value = "SELECT questions FROM Categorie u WHERE u.idCat = :id ")
    	List<Question> getlisteQuestionParCategorie(@Param("id") Long id);
}
