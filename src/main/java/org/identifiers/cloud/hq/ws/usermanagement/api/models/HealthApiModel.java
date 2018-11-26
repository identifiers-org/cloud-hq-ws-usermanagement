package org.identifiers.cloud.hq.ws.usermanagement.api.models;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.api.models
 * Timestamp: 2018-11-26 13:53
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Component
public class HealthApiModel {
    private static String runningSessionId = UUID.randomUUID().toString();

    public String livenessCheck() {
        return runningSessionId;
    }

    public String readinessCheck() {
        return runningSessionId;
    }

}
