package mongodbanalysis;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class retrieve {

    public retrieve() {
    }

    public void Retrieve() throws UnknownHostException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));

        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("mongoanalysis");
        //DBCollection collection = db.getCollection("mongoanalysis");
        DBCollection coll = db.getCollection("mongoanalysis");

        System.out.println("Collection has selected successfully");
        DBCursor cursor = coll.find();
        int index = 1;

        while (cursor.hasNext()) {
           String  a;
            a = cursor.next().getString("column1");
            System.out.println("Inserted Document: " + index);
            System.out.println(cursor.next());
            index++;
        }

        Instant ter = Instant.now();
        Date date1 = new Date();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date1) + "\n" + "Duration: " + duration.getSeconds() + " second/s");
    }
}
