package org.identifiers.cloud.hq.ws.usermanagement.api.controllers;

import org.identifiers.cloud.hq.ws.usermanagement.api.data.models.UserRegistrationRequestModel;
import org.springframework.web.bind.annotation.*;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.api.controllers
 * Timestamp: 2019-01-11 11:33
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@RestController
@RequestMapping("registrationApi")
public class RegistrationApiController {
    // TODO

    @PostMapping("registerUser")
    public @ResponseBody
    String registerUser(@RequestBody UserRegistrationRequestModel userRegistrationRequestModel) {
        return "User registration request received for " + userRegistrationRequestModel.toString();
    }
}
