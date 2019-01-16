package org.identifiers.cloud.hq.ws.usermanagement.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

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
    String unprotectedEndpoint(Principal principal) {
        return "This is the unprotected endpoint - " + principal;
    }

    @GetMapping("/protected")
    public @ResponseBody
    String protectedEndpoint(Principal principal) {
        return "This is the PROTECTED endpoint - " + principal.getName();
    }
}
