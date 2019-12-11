package mongodbanalysis;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MongodbAnalysis {

    public static void main(String[] args) throws UnknownHostException {
        retrieve r=new retrieve();
        r.Retrieve();
        // TODO code application logic here
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        Instant fore = Instant.now();
//        System.out.println("Time started: " + formatter.format(date));
//        try {
//
//            for (int i = 5; i <10; i++) {
//                
//                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
//                mongoLogger.setLevel(Level.SEVERE);
//                MongoClient mongoClient = new MongoClient("localhost", 27017);
//                DB db = mongoClient.getDB("mongoanalysis");
//                DBCollection collection = db.getCollection("mongoanalysis");
//                BasicDBObject insert1000 = new BasicDBObject("column1", Integer.toString(i)).append("column2",Integer.toString(i+1));
//                collection.insert(insert1000);
//                System.out.println("Inserted!");
//            }
//        } catch (SecurityException e) {
//            System.out.println("Error is: " + e);
//        }
//        Instant ter = Instant.now();
//        Date date1 = new Date();
//        Duration duration = Duration.between(fore, ter);
//        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");
  
    }
}
