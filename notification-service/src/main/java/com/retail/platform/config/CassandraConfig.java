package com.retail.platform.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.contact-points}")
	private String cassandraContactPoints;

	@Value("${spring.data.cassandra.port}")
	private int cassandraPort;

	@Value("${spring.data.cassandra.keyspace-name}")
	private String cassandraKeySpace;

//		  @Value("${spring.data.cassandra.username}")
//		  private String username;
//
//		  @Value("${spring.data.cassandra.password}")
//		  private String password;

	@Value("${spring.data.cassandra.schema-action}")
	private String cassandraSchemaAction;

	@Override
	protected String getKeyspaceName() {
		return cassandraKeySpace;
	}

	@Override
	protected String getContactPoints() {
		return cassandraContactPoints;
	}

	@Override
	protected int getPort() {
		return cassandraPort;
	}

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.valueOf(cassandraSchemaAction);
	}

	@Override
	protected boolean getMetricsEnabled() {
		return false;
	}

//		  Cluster cluster = Cluster.builder()
//				  .withoutJMXReporting()
//				  .build();

//		  @Override
//		  protected AuthProvider getAuthProvider() {
//		    return new PlainTextAuthProvider(username, password);
//		  }
}
