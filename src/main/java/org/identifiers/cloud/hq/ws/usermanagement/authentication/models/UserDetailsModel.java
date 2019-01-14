package org.identifiers.cloud.hq.ws.usermanagement.authentication.models;

import org.identifiers.cloud.hq.ws.usermanagement.data.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.authentication.models
 * Timestamp: 2019-01-13 13:49
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
public class UserDetailsModel extends User implements UserDetails {
    private List<GrantedAuthority> grantedAuthorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getUsername() {
        return getEmail();
    }

    // We have no notion of expiry date on accounts right now
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // We don't have a mechanism to lock accounts right now
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // We don't have a mechanism for credentials expiration right now
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isActive();
    }
}
