package org.identifiers.cloud.hq.ws.usermanagement.configuration;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.configuration
 * Timestamp: 2019-01-12 11:36
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Configuration
public class InMemoryAuthenticationConfiguration {

    @Bean
    public UserDetailsService memory() {
        return new InMemoryUserDetailsManager();
    }

    @Bean
    InitializingBean initializer(UserDetailsManager manager) {
        return () -> {
            UserDetails usera =
                    User.withDefaultPasswordEncoder().username("usera").password("password").roles("USER").build();
            manager.createUser(usera);
            UserDetails userb = User.withUserDetails(usera).username("userb").build();
            manager.createUser(userb);
        };
    }
}
