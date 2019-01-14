package org.identifiers.cloud.hq.ws.usermanagement.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.configuration
 * Timestamp: 2019-01-12 10:56
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    // TODO

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // HTTP Basic based authentication
        http
                .csrf().disable()
                .authorizeRequests().anyRequest().authenticated()
                .and().httpBasic()
                .and().sessionManagement().disable();
    }
}
