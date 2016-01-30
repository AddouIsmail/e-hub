package com.ehub.controllers;

import com.ehub.entities.Admin;
import com.ehub.repositories.AdminRepository;
import com.ehub.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
@Controller
public class IndexController {
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping("/")
    String index(Model model) {
        Admin admin = new Admin();
        admin.setFirstName("Boyka");
        adminRepository.save(admin);
        model.addAttribute("admins", adminRepository.findAll());
        System.out.println("Returning rpoducts:");
        return "index";
    }
}
