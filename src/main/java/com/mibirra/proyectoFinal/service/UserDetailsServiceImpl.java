package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.entity.User;
import com.mibirra.proyectoFinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password(user.getPass())
                .roles("USER") // Cargar los roles dinámicamente desde la base de datos
                .build();
    }
}
