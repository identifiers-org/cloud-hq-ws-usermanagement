package org.identifiers.cloud.hq.ws.usermanagement.authentication.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.identifiers.cloud.hq.ws.usermanagement.data.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.authentication.models
 * Timestamp: 2019-01-13 13:49
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class UserDetailsModel implements UserDetails {
    private User user;
    private List<SimpleGrantedAuthority> grantedAuthorities;

    private List<SimpleGrantedAuthority> computeGrantedAuthorities() {
        return user.getRoles().parallelStream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (grantedAuthorities == null) {
            grantedAuthorities = computeGrantedAuthorities();
        }
        return grantedAuthorities;
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
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
        return user.isActive();
    }
}
