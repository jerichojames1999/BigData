/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongodbanalysis;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

//import com.journaldev.mongodb.model.User;
//import com.mongodb.BasicDBObjectBuilder;
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.DBObject;
//import com.mongodb.MongoClient;
//import com.mongodb.WriteResult;
import mongodbanalysis.MongoDatabase;

/**
 *
 * @author Villahermosa_sd2082
 */
public class MongodbAnalysis {

    /**
     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        // TODO code application logic here
               try {
            // Connect to MongoDB Server on localhost, port 27017 (default)
            final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
            // Connect to Database "cartoon"
            final MongoDatabase database = mongoClient.get("bigdatajericho");
            System.out.println("Successful database connection established. \n");

        } catch (Exception exception) {
            System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }
//    
//	public static void main(String[] args) throws UnknownHostException {
//	
//		User user = createUser();
//		DBObject doc = createDBObject(user);
//		
//		MongoClient mongo = new MongoClient("localhost", 27017);
//		DB db = mongo.getDB("bigdatajericho");
//		
//		DBCollection col = db.getCollection("databaseanalysis");
//		
//		//create user
//		WriteResult result = col.insert(doc);
//		System.out.println(result.getUpsertedId());
//		System.out.println(result.getN());
//		System.out.println(result.isUpdateOfExisting());
//		System.out.println(result.getLastConcern());
//		
//		//read example
//		DBObject query = BasicDBObjectBuilder.start().add("_id", user.getId()).get();
//		DBCursor cursor = col.find(query);
//		while(cursor.hasNext()){
//			System.out.println(cursor.next());
//		}
//		
//		//update example
//		user.setName("Pankaj Kumar");
//		doc = createDBObject(user);
//		result = col.update(query, doc);
//		System.out.println(result.getUpsertedId());
//		System.out.println(result.getN());
//		System.out.println(result.isUpdateOfExisting());
//		System.out.println(result.getLastConcern());
//		
//		//delete example
//		result = col.remove(query);
//		System.out.println(result.getUpsertedId());
//		System.out.println(result.getN());
//		System.out.println(result.isUpdateOfExisting());
//		System.out.println(result.getLastConcern());
//		
//		//close resources
//		mongo.close();
//	}
//
//	private static DBObject createDBObject(User user) {
//		BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
//								
//		docBuilder.append("_id", user.getId());
//		docBuilder.append("name", user.getName());
//		docBuilder.append("role", user.getRole());
//		docBuilder.append("isEmployee", user.isEmployee());
//		return docBuilder.get();
//	}
//
//	private static User createUser() {
//		User u = new User();
//		u.setId(2);
//		u.setName("Pankaj");
//		u.setEmployee(true);
//		u.setRole("CEO");
//		return u;
//	}
//	

}
