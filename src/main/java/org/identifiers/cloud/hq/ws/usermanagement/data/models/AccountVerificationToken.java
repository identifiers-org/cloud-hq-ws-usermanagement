package org.identifiers.cloud.hq.ws.usermanagement.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.data.models
 * Timestamp: 2018-11-27 10:46
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 *
 * This model represents an account verification token
 */
@Document
public class AccountVerificationToken {
    // 48 hours is the default expiry date for an authorization token
    public static final long VERIFICATION_TOKEN_TTL_MILLIS = 48 * 3600 * 1000;
    // This makes sure the token is there when dealing with objects of this class
    @Id private String id = UUID.randomUUID().toString();
    private Timestamp created = new Timestamp(System.currentTimeMillis());
    private Timestamp expiryDate = new Timestamp(created.getTime() + AccountVerificationToken.VERIFICATION_TOKEN_TTL_MILLIS);
    private boolean used = false;

    public String getId() {
        return id;
    }

    public AccountVerificationToken setId(String id) {
        this.id = id;
        return this;
    }

    public Timestamp getCreated() {
        return created;
    }

    public AccountVerificationToken setCreated(Timestamp created) {
        this.created = created;
        return this;
    }

    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public AccountVerificationToken setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public boolean isUsed() {
        return used;
    }

    public AccountVerificationToken setUsed(boolean used) {
        this.used = used;
        return this;
    }
}
