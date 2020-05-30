package com.retail.platform.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.notification.ApplicationName;
import com.retail.platform.model.Subscription;

@Repository
public interface SubscriptionRepository extends CassandraRepository<Subscription, UUID> {
	List<Subscription> findByChannelName(ApplicationName name);

}
