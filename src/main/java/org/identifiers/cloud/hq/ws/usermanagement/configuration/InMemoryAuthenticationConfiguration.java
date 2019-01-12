package org.identifiers.cloud.hq.ws.usermanagement.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

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
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager();
    }
}
