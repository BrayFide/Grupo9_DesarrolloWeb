/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.service.impl;

import com.MiBirra.proyectofinal.dao.UsersDao;
import com.MiBirra.proyectofinal.domain.Rol;
import com.MiBirra.proyectofinal.domain.Users;
import com.MiBirra.proyectofinal.service.UsersDetailsService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author charlie
 */
@Service("userDetailsService")
public class UsersDetailsServiceImpl
        implements UsersDetailsService, UserDetailsService {

    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional(readOnly=true)

public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Users user = usersDao.findByUsername(username);
    if (user == null) {
        throw new UsernameNotFoundException("User not found");
    }
    return new org.springframework.security.core.userdetails.User(
        user.getUsername(), 
        user.getPass(), 
        getAuthorities(user)
    );
}

private Collection<? extends GrantedAuthority> getAuthorities(Users user) {
    return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + user.getRol().getName()));
}

}

