package com.imsc.det.profil.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.beans.dao.AdminRepository;
import com.imsc.det.profil.beans.dao.TestRepository;

@SpringBootApplication
public class DerProfilImscApplication  implements CommandLineRunner
{
    @Autowired
	private  AdminRepository  adminRepository ;
    @Autowired
    private TestRepository testRepository ;
	
		 
	public static void main(String[] args) {
//    ApplicationContext ctx= 
			 SpringApplication.run(DerProfilImscApplication.class, args);
// AdminRepository  adminRepository =ctx.getBean(AdminRepository.class) ;
//	 adminRepository.save( new Admin("nom", "image", "mdp", "email"));
	
	}

	@Override
	public void run(String... args) throws Exception {
//	 Admin a=	 adminRepository.save( new Admin("nom", "image", "mdp", "email"));
//	 Admin a2=	 adminRepository.save( new Admin("nom1", "image1", "mdp1", "email1"));
//	 
//	Test t1= new Test();
//	t1.setAdmin(a);
//	t1.setIntitule("dddddddddd");
//	testRepository.save(t1);
	
	}


}
