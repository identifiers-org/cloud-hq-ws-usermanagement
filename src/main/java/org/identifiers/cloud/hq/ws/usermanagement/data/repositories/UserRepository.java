package org.identifiers.cloud.hq.ws.usermanagement.data.repositories;

import org.identifiers.cloud.hq.ws.usermanagement.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Project: user-management
 * Package: org.identifiers.cloud.hq.ws.usermanagement.data.repositories
 * Timestamp: 2019-01-13 12:50
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
public interface UserRepository extends MongoRepository<User, String> {
    // TODO
    User findByEmail(String email);
}
