package com.ehub.services;

import com.ehub.entities.Admin;
import com.ehub.repositories.AdminRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    public void setAdminRepository(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }
}
