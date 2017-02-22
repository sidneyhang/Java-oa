package com.tinthon.service;

import com.tinthon.domain.Spitter;
import com.tinthon.repository.SpitterRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sidney on 2017/2/15.
 */
public class SpitterUserService implements UserDetailsService {

    private SpitterRepository spitterRepository;

    public SpitterUserService(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Spitter spitter = spitterRepository.findByUsername(username);
        if (spitter != null) {
            List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
            authorityList.add(new SimpleGrantedAuthority("ROLE_SPITTER"));

            return new User(
                    spitter.getUsername(),
                    spitter.getPassword(),
                    authorityList
            );
        }
        throw new UsernameNotFoundException(
                "User '" + username + "' not found."
        );
    }
}
