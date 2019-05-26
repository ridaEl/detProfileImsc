package com.imsc.det.profil.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.dao.AdminRepository;

@SpringBootApplication
public class DerProfilImscApplication implements CommandLineRunner{
   @Autowired
	private  AdminRepository  adminRepository ;
	
		 
	public static void main(String[] args) {
	 ApplicationContext ctx= SpringApplication.run(DerProfilImscApplication.class, args);
	 AdminRepository  adminRepository =ctx.getBean(AdminRepository.class) ;
	 adminRepository.save( new Admin("nom", "image", "mdp", "email"));
	
	}

	@Override
	public void run(String... args) throws Exception {
	 Admin a=	 adminRepository.save( new Admin("nom", "image", "mdp", "email"));
		
	}


}
