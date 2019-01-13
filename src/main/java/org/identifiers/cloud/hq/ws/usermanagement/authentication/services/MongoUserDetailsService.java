package org.identifiers.cloud.hq.ws.usermanagement.authentication.services;

import org.identifiers.cloud.hq.ws.usermanagement.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.authentication.services
 * Timestamp: 2019-01-13 13:14
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
public class MongoUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
