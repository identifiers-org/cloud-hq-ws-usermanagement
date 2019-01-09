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
}
