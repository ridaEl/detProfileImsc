package com.imsc.det.profil.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.imsc.det.profil.beans.dao.AdminRepository;
import com.imsc.det.profil.beans.dao.CategorieRepository;
import com.imsc.det.profil.beans.dao.ReponseRepository;
import com.imsc.det.profil.beans.metier.AdminMetierImpl;
import com.imsc.det.profil.beans.metier.CategorieMetierImpl;
import com.imsc.det.profil.beans.metier.QuestionMetierImpl;
import com.imsc.det.profil.beans.metier.ReponseMetierImpl;
import com.imsc.det.profil.beans.metier.TestMetierImpl;

@SpringBootApplication
public class DerProfilImscApplication  implements CommandLineRunner
{
	public static void main(String[] args) {
		//  ApplicationContext ctx= 
    		SpringApplication.run(DerProfilImscApplication.class, args);
   //AdminRepository  adminRepository =ctx.getBean(AdminRepository.class) ;
	// adminRepository.save( new Admin("nom", "image", "mdp", "email")); 
 	//adminRepository.delete(1L);
 
	}

	@Override
	public void run(String... args) throws Exception {
	//	testeMetierImpl.delete(1L); 
		
		
		//
	//	questionMetierImpl.save(new Question("Intithhhhhhule"));
	//	questionMetierImpl.delete(1L);
		//categorieMetierImpl.delete(1L);;
	//	reponseMetierImpl.delete(1L);
		// adminMetierImpl.save(new Admin("nom", "image", "mdp", "email"));
//		 adminMetierImpl.delete(4L);
	
	//	AdminMetierImpl adminMetierImpl = new AdminMetierImpl() ;
	//	adminMetierImpl.save(new Admin("nom", "image", "mdp", "email"));;
	
	}


}
