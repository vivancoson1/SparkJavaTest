package com.test.sparks.common;

public interface ResourceProperties {
	static final ClassLoader CLASS_LOADER = ResourceProperties.class.getClassLoader();
	
	static final String POSTGRESQL_PROPERTIES = "rdbms/postgresql.properties";
	static final String MYSQL_PROPERTIES = "rdbms/mysql.properties";
	static final String CASSANDRA_PROPERTIES = "nosql/cassandra.properties";
	static final String JSON_LOCATION  = "jsons/people.json";
	static final String CSV_LOCATION = "csv/people.csv";
}
