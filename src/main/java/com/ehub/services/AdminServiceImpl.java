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
	public Admin findById(String id) {
		// TODO Auto-generated method stub
		return adminRepository.findOne(id);
	}

	@Override
	public Admin update(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return adminRepository.deleteById(id);
	}

	@Override
	public Admin findByLogin(String login) {
		// TODO Auto-generated method stub
		return adminRepository.findByLogin(login);
	}

	@Override
	public Admin insert(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.insert(admin);
	}
	
	
}
