package com.ehub.services;

import com.ehub.entities.Admin;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface AdminService {
    Iterable<Admin> findAll();
}
