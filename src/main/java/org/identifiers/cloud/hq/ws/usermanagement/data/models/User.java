package org.identifiers.cloud.hq.ws.usermanagement.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
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
    @Id private String id;
    @NotNull(message = "It is mandatory for a user to have an e-mail address")
    @Indexed(unique = true)
    private String email;
    private String password;
    // By default, a newly created account is neither verified nor active
    private boolean verified = false;
    private boolean active = false;
    @DBRef private List<Role> roles = new ArrayList<>();
    @DBRef private List<AccountVerificationToken> accountVerificationTokens = new ArrayList<>();
}
