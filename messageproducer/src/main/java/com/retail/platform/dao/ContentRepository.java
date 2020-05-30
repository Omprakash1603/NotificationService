package com.retail.platform.dao;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.retail.platform.model.Content;

@Repository
public interface ContentRepository extends CassandraRepository<Content, UUID> {

}
