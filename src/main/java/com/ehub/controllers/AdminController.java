package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ehub.entities.Admin;
import com.ehub.services.AdminService;

@RestController
public class AdminController {
	private AdminService adminService;
	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	@RequestMapping(value = "/admins", method = RequestMethod.GET)
    public Iterable<Admin> listAdmins(){
	return adminService.findAll();
	}
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
    public Admin insertAdmin(@RequestBody Admin admin){
	return adminService.insert(admin);
	}
	@RequestMapping(value = "/admin", method = RequestMethod.PUT)
    public Admin updateAdmin(@RequestBody Admin admin){
	return adminService.update(admin);
	}
	@RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
    public Admin getAdminById(@PathVariable String id){
	return adminService.findById(id);
	}
	@RequestMapping(value = "/admin/{id}", method = RequestMethod.DELETE)
    public Long deleteAdminById(@PathVariable String id){
	return adminService.deleteById(id);
	}	
}
