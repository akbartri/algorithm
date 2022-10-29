package basic.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("key","value");

        // how to loop map
        for(Map.Entry<String,String> valueMap : maps.entrySet())System.out.println("Key : " + valueMap.getKey() + ", Value: "+valueMap.getValue());
//        maps.remove();
    }
}
