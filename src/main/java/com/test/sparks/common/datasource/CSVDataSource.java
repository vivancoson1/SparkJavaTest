package com.test.sparks.common.datasource;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.test.sparks.common.PropertyKey;
import com.test.sparks.common.ResourceProperties;

public interface CSVDataSource extends ResourceProperties, PropertyKey {
	
	static final boolean TRUE = true;
	
	default Dataset<Row> getDataSet(SparkSession sparkSession) {
		return sparkSession.read()
					.option(CSV_HEADER, TRUE)
					.csv(CLASS_LOADER.getResource(CSV_LOCATION).toString());
	}
}
