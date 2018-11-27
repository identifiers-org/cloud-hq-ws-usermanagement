package org.identifiers.cloud.hq.ws.usermanagement.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.data.models
 * Timestamp: 2018-11-27 10:07
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Document
public class User {
    @Id private BigInteger id;
    @NotNull(message = "It is mandatory for a user to have an e-mail address")
    @Indexed(unique = true)
    private String email;
    private boolean verified = false;
    private boolean active = false;
}
