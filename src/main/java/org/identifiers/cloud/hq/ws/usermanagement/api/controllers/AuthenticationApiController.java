package org.identifiers.cloud.hq.ws.usermanagement.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.api.controllers
 * Timestamp: 2019-01-09 15:57
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@RestController
@RequestMapping("authenticationApi")
public class AuthenticationApiController {
    // TODO

    // TODO - Mark this endpoint as not authenticated
    @GetMapping("/unprotected")
    public @ResponseBody
    String unprotectedEndpoint() {
        return "This is the unprotected endpoint";
    }

    @GetMapping("/protected")
    public @ResponseBody
    String protectedEndpoint() {
        return "This is the PROTECTED endpoint";
    }
}
