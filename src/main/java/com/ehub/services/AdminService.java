package com.ehub.services;

import com.ehub.entities.Admin;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface AdminService {
    Iterable findAll();
    public Admin findById(String id);
    public Admin insert(Admin admin);
	public Admin update(Admin admin);
	public Long deleteById(String id);
	public Admin findByLogin(String login);
}
