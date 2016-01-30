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
    public Iterable listAdmins(){
	return adminService.findAll();
	}
	@RequestMapping(value = "/saveAdmin", method = RequestMethod.POST)
    public Admin saveAdmin(@RequestBody Admin admin){
	return adminService.save(admin);
	}
	@RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
    public Admin getAdminById(@PathVariable String id){
	return adminService.getAdminById(id);
	}
}
