
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> h = new HashMap<String,String>();
        h.put("matti", "mage");
        h.put("mikael","mixu");
        h.put("arto","arppa");
        
        System.out.println(h.get("mikael"));
    }

}
