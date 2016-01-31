package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ehub.entities.Admin;
import com.ehub.services.AdminService;
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
	private AdminService adminService;
	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	@RequestMapping(method = RequestMethod.GET)
    public Iterable<Admin> listAdmins(){
	return adminService.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
    public Admin insertAdmin(@RequestBody Admin admin){
	return adminService.insert(admin);
	}
	@RequestMapping(method = RequestMethod.PUT)
    public Admin updateAdmin(@RequestBody Admin admin){
	return adminService.update(admin);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Admin getAdminById(@PathVariable String id){
	return adminService.findById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteAdminById(@PathVariable String id){
	return adminService.deleteById(id);
	}	
}
