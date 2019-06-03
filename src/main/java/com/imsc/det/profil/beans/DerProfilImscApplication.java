package com.imsc.det.profil.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.imsc.det.profil.beans.dao.AdminRepository;
import com.imsc.det.profil.beans.dao.CategorieRepository;
import com.imsc.det.profil.beans.dao.QuestionRepository;
import com.imsc.det.profil.beans.dao.ReponseRepository;
import com.imsc.det.profil.beans.metier.AdminMetierImpl;
import com.imsc.det.profil.beans.metier.CategorieMetierImpl;
import com.imsc.det.profil.beans.metier.QuestionMetierImpl;
import com.imsc.det.profil.beans.metier.ReponseMetierImpl;
import com.imsc.det.profil.beans.metier.TestMetierImpl;

@SpringBootApplication
public class DerProfilImscApplication  implements CommandLineRunner
{@Autowired
	private QuestionRepository QuestionRepository;
	public static void main(String[] args) {
		//  ApplicationContext ctx= 
    		SpringApplication.run(DerProfilImscApplication.class, args);
   //AdminRepository  adminRepository =ctx.getBean(AdminRepository.class) ;
	// adminRepository.save( new Admin("nom", "image", "mdp", "email")); 
 	//adminRepository.delete(1L);
 
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Question> q= (List<Question>) QuestionRepository.getlisteQuestionParCategorie(2L);
//		ArrayList<Question> newListQuestion= new ArrayList<Question>();
//			for( Question qq :q) {
//				Question question=new Question(qq.getIntituleQuest());
//				question.setIdQuest(qq.getIdQuest());
//				newListQuestion.add(question);
//
//		}
//		System.out.println("--------------------------");
	}


}
