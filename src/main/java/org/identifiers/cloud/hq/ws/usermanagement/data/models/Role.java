package org.identifiers.cloud.hq.ws.usermanagement.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.data.models
 * Timestamp: 2018-11-27 10:19
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 *
 * This model represents a role that can be associated with a user
 */
@Document
public class Role {
    @Id private String id;
    @Indexed(unique = true) private String name;
    private String description;

    public BigInteger getId() {
        return id;
    }

    public Role setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }
}
