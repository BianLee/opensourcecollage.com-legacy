package opensourcecollagemongo;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import org.bson.types.ObjectId;

public class MongoDBAtlasClient {
	public static void main(String[] args) {
		MongoClientURI uri = new MongoClientURI(
	  "mongodb+srv://bostonlobstergang:<password>@cluster0.plwnl.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("cluster0");
		MongoCollection<Document> collection = database.getCollection("messages");
		// collection.deleteOne(new Document("date", "asdf"));
		Bson filter = new Document("title", "asdf");
		collection.deleteMany(filter); 
		// collection.deleteMany(new Document("stock", "Brent Crude Futures", "limit" : { $gt : 48.88 })
		/* MongoCollection<Document> collection = database.getCollection("messages");
		Document query = new Document("_id", new ObjectId("60594f44e5455200091f76dc"));
        // Document result = collection.find(query).iterator().next();
		System.out.println(query);  */ 
			
			{
		}
	}
}
