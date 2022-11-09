import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
    - eerst een feasable oplossing vormen dan lokaal zoeken om betere oplossingen te zoeken
    - welke datastructuur voor de oplossing, zien dat oplossing 1x gesaved wordt LinkedList
    - geen unavailability in de linked list oplossing steken
    - setup tijd kan wel in de linked list om de heuristiek makkelijker te maken
*/
public class Main {
    public static void main(String[] args) throws Exception {
        Object obj = new JSONParser().parse(new FileReader("./input/TOY-20-10.json"));
        JSONObject jo = (JSONObject) obj;
        String name = (String)jo.get("name");
        double weight_duration = (double)jo.get("weight_duration");
        long horizon = (long)jo.get("horizon");
        System.out.println("Test: "+name+", duration "+ weight_duration+", horizon: "+horizon);
        JSONArray jobsArray = (JSONArray) jo.get("jobs");
        List<Job> jobs = new ArrayList<>();
        for (Object o : jobsArray) {
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
        JSONArray unavailability = (JSONArray) jo.get("unavailability");
        Unavailability un = new Unavailability(horizon);
        for(Object o : unavailability){
            JSONObject temp = (JSONObject)o;
            long start = (long)temp.get("start");
            long end = (long)temp.get("end");
            un.addUnavailable(start,end);
        }
        JSONArray s = (JSONArray) jo.get("setups");
        for(Object o : s){
            JSONObject temp = (JSONObject) o;
            int[][] setups = new int[jobs.size()][jobs.size()];
            for(int i=0; i<s.size(); i++){
                setups[i] = (int[]) temp.get("");
            }
            for(int[] t : setups){
                for(int g : t){
                    System.out.print(g+" ");
                }
            }
        }
    }
}