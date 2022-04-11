package com.vmware.messaging.service.repository;

import com.vmware.messaging.service.entities.Subscription;
import org.springframework.data.repository.CrudRepository;

/**
 * @author gurnoorsingh
 */
public interface MessagingRepository extends CrudRepository<Subscription, Long> {

}
