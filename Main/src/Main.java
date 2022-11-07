import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        Object obj = new JSONParser().parse(new FileReader("./input/TOY-20-10.json"));
        JSONObject jo = (JSONObject) obj;
        String name = (String)jo.get("name");
        double weight_duration = (double)jo.get("weight_duration");
        long horizon = (long)jo.get("horizon");
        JSONArray ja = (JSONArray) jo.get("jobs");
        for(int i=0; i<ja.size() ; i++){
            JSONObject temp = (JSONObject) ja.get(i);
            int id = (int)temp.get("id");
        }
    }
}