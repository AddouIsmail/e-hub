package com.ehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehub.entities.Admin;
import com.ehub.repositories.AdminRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;
    @Autowired
    public void setAdminRepository(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Iterable findAll() {
        return adminRepository.findAll();
    }

	@Override
	public Admin getAdminById(String id) {
		// TODO Auto-generated method stub
		return adminRepository.findOne(id);
	}

	@Override
	public Admin save(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}
}
