package com.imsc.det.profil.beans.services;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;

import com.imsc.det.profil.beans.Admin;
import com.imsc.det.profil.beans.metier.AdminMetier;

@RestController
public class AdminRestService {
	

	 @Autowired
	private AdminMetier adminmetier;
	 @RequestMapping(value="/admin",method=RequestMethod.POST)
	public void save(@RequestBody Admin admin) {
		 admin.setRole("admin");
		adminmetier.save(admin);
	}

	 @PutMapping( path="/admin/{id}"  )
	 public void update(@PathVariable Long id,@RequestBody Admin adm) {
		
			adminmetier.update(id, adm);
		}
	 
	@DeleteMapping("/admin/{id}")
	public void deleteStudent(@PathVariable Long id) {
		adminmetier.delete(id);
	}
	 @RequestMapping(value="/getLogedAdmin")
	public Map<String,Object>getLogedAdmin(HttpServletRequest httpServletRequest){
		 HttpSession httpSession = httpServletRequest.getSession();
		 SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
		 String username=securityContext.getAuthentication().getName();
		 List<String> roles = new ArrayList<>();
		 for(GrantedAuthority ga : securityContext.getAuthentication().getAuthorities() ) {
			 roles.add(ga.getAuthority());
		 }
		 Map<String ,Object> params = new HashMap<>();
		 params.put("username", username);
		 params.put("roles", roles);
		return params;	
	}
}
