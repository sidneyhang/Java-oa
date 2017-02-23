package com.tinthon.config;

import com.tinthon.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sidney on 2017/2/23.
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository;

    UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.tinthon.domain.User user = userRepository.findByAccount(username);
        if (user != null) {
            List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
            authorityList.add(new SimpleGrantedAuthority("ROLE_SPITTER"));

            return new User(
                    user.getAccount(),
                    user.getPassword(),
                    authorityList
            );
        }
        throw new UsernameNotFoundException(
                "User '" + username + "' not found."
        );
    }
}
