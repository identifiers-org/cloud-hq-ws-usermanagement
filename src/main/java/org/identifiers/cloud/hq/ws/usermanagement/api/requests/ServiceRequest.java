package org.identifiers.cloud.hq.ws.usermanagement.api.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.api.requests
 * Timestamp: 2018-11-26 13:47
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRequest<T> implements Serializable {
    private String apiVersion;
    private T payload;

    public String getApiVersion() {
        return apiVersion;
    }

    public ServiceRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public T getPayload() {
        return payload;
    }

    public ServiceRequest setPayload(T payload) {
        this.payload = payload;
        return this;
    }
}
