package org.identifiers.cloud.hq.ws.usermanagement.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.data.models
 * Timestamp: 2018-11-27 10:07
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 *
 * This models the main document that represents a user, and the minimum amount of information around it.
 */
@Document
public class User {
    @Id private BigInteger id;
    @NotNull(message = "It is mandatory for a user to have an e-mail address")
    @Indexed(unique = true)
    private String email;
    private String password;
    // By default, a newly created account is neither verified nor active
    private boolean verified = false;
    private boolean active = false;
    @DBRef private List<Role> roles = new ArrayList<>();
    @DBRef private List<AccountVerificationToken> accountVerificationTokens = new ArrayList<>();

    public BigInteger getId() {
        return id;
    }

    public User setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isVerified() {
        return verified;
    }

    public User setVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public User setActive(boolean active) {
        this.active = active;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }
}
