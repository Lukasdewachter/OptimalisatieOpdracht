import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;

/*
    - eerst een feasable oplossing vormen dan lokaal zoeken om betere oplossingen te zoeken
    - welke datastructuur voor de oplossing, zien dat oplossing 1x gesaved wordt LinkedList
    - geen unavailability of setup tijd in de linked list oplossing steken
*/
public class Main {
    public static void main(String[] args) throws Exception {
        Object obj = new JSONParser().parse(new FileReader("./input/TOY-20-10.json"));
        JSONObject jo = (JSONObject) obj;
        String name = (String)jo.get("name");
        double weight_duration = (double)jo.get("weight_duration");
        long horizon = (long)jo.get("horizon");
        JSONArray ja = (JSONArray) jo.get("jobs");
        List<Job> jobs = new ArrayList<Job>();
        for (Object o : ja) {
            JSONObject temp = (JSONObject) o;
            long id = (long) temp.get("id");
            long duration = (long) temp.get("duration");
            long release_date = (long) temp.get("release_date");
            long due_date = (long) temp.get("due_date");
            double earliness_penalty = (double) temp.get("earliness_penalty");
            double rejection_penalty = (double) temp.get("rejection_penalty");
            Job job = new Job(id, duration, release_date, due_date, earliness_penalty, rejection_penalty);
            jobs.add(job);
        }
    }
}