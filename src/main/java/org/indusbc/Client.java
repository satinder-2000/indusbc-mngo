package org.indusbc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Client {

	public static void main(String[] args) {
		String connectionString = "mongodb+srv://ssingh2023:ZwBB5wp24qxflx5h@cluster0.odhclyh.mongodb.net/?retryWrites=true&w=majority";//System.getProperty("mongodb.uri");
        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase indusbcDB=mongoClient.getDatabase("indusbc");
        MongoCollection<Document> expensePartiesCollection = indusbcDB.getCollection("ExpenseParty");
        if (expensePartiesCollection == null) {
        	System.out.println("null collection");
        }else {
        	System.out.println("size of collection is :"+expensePartiesCollection.countDocuments());
        }
        Document expenseParty = new Document("_id", new ObjectId());
        expenseParty.append("name", "IndusbcEP 1")
        .append("email", "ep1@indusbc.org")
        .append("organisation", "Organisation 1")
        .append("expenseCategories", Arrays.asList(new Document("expenseCategory","Pension"),new Document("expenseCategory","Defense")))
        .append("identityType", "AAdhar Card number")
        .append("identityId", "1234567890")
        .append("memorableDate", "27/11/1973");
        expensePartiesCollection.insertOne(expenseParty);
        expensePartiesCollection = indusbcDB.getCollection("ExpenseParty");
        if (expensePartiesCollection == null) {
        	System.out.println("null collection");
        }else {
        	Iterable<Document> expensePartiesItrble = expensePartiesCollection.find();
        	Iterator<Document> expensePartyItr = expensePartiesItrble.iterator();
        	while(expensePartyItr.hasNext()) {
        		Document doc = expensePartyItr.next();
        		System.out.println(doc.toJson());
        	}
        }
    }
}
