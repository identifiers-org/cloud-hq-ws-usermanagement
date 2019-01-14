package org.identifiers.cloud.hq.ws.usermanagement.authentication.services;

import lombok.extern.slf4j.Slf4j;
import org.identifiers.cloud.hq.ws.usermanagement.authentication.models.UserDetailsModel;
import org.identifiers.cloud.hq.ws.usermanagement.data.models.User;
import org.identifiers.cloud.hq.ws.usermanagement.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.authentication.services
 * Timestamp: 2019-01-13 13:14
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Slf4j
@Component
public class MongoUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(s);

        if (user == null) {
            log.error("Loading user by username - '" + s + "', NOT FOUND");
            throw new UsernameNotFoundException("User " + s + " NOT FOUND");
        }
        log.info("Loading user by username - '" + s + "', user LOCATED");
        UserDetailsModel userDetailsModel = new UserDetailsModel();
        userDetailsModel.setUser(user);
        // TODO
        return userDetailsModel;
    }
}
