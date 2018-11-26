package org.identifiers.cloud.hq.ws.usermanagement.api.controllers;

import org.identifiers.cloud.hq.ws.usermanagement.api.models.HealthApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.api.controllers
 * Timestamp: 2018-11-26 13:53
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@RestController
@RequestMapping("healthApi")
public class HealthApiController {
    @Autowired
    private HealthApiModel model;

    // liveness probe
    @RequestMapping(value = "/liveness_check")
    public String livenessCheck() {
        return model.livenessCheck();
    }

    // Readiness check
    @RequestMapping(value = "/readiness_check")
    public String readinessCheck() {
        return model.readinessCheck();
    }
}