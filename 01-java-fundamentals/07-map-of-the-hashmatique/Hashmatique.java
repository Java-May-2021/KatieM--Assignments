import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void saveTracks() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Loyalty", "It's the secret society");
        map.put("Suga Suga", "So fly,so high");
        map.put("Happy", "Because I'm happy");
        map.put("Young and Wild", "We are young and wild");

        String val = map.get("Suga Suga");

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}
