package com.zlc.mongodbconnect;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.util.Arrays;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) throws Exception{
		
		MongoClient mongoClient = new MongoClient();
		// or
		//MongoClient mongoClient = new MongoClient( "localhost" );
		// or
		//MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		// or, to connect to a replica set, supply a seed list of members
		//MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),new ServerAddress("localhost", 27018),	                                      new ServerAddress("localhost", 27019)));

		//DB db = m.getDB( "mydb" );
		
		//MongoClient mongoClient = new MongoClient();
		DB db = mongoClient.getDB("mydb");
		//boolean auth = db.authenticate(myUserName, myPassword);
	Set<String> colls = db.getCollectionNames();

	for (String s : colls) {
	    System.out.println(s);
	}
	}

}
