package com.yahoo.ycsb.db;

import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.Status;

public class ThingSpanClient extends DB {
	
	private static final String DEFAULT_BOOT = "ycsb.boot";
	private String boot;

	@Override
	public void init() throws DBException {
		Properties props = getProperties();
		boot = props.getProperty("thingspan.boot", DEFAULT_BOOT);
		
		// TODO initialize ThingSpan
		
	}
	@Override
	public void cleanup() throws DBException {
		// TODO Terminate ThingSpan
		
	}

	@Override
	public Status read(String type, String key, Set<String> fields, HashMap<String, ByteIterator> result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status scan(String type, String startkey, int recordcount, Set<String> fields,
			Vector<HashMap<String, ByteIterator>> result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status update(String type, String key, HashMap<String, ByteIterator> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status insert(String type, String key, HashMap<String, ByteIterator> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status delete(String type, String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
