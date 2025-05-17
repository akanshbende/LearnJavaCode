package Map.ImmutableMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();

        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);



        Map<String,Integer> map2= Collections.unmodifiableMap(map1);
        System.out.println(map2);

        map2.put("C",6);// throws error.

        System.out.println(map2);


        Map<String,Integer> map3= Map.of("Shubham",2,"Akshit",7);
        map3.put("Vivek",5);

        Map<String,Integer> map4= Map.ofEntries(Map.entry("Shubham",2),Map.entry("Akshit",7));
    }
}
