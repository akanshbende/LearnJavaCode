package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String k1=new String("key");
        String k2=new String("key");


//        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map=new IdentityHashMap<>();// calculate Object hashcode instead of string hashcode

        // hashcode and equals
        map.put(k1,1);
        map.put(k2,2);

        System.out.println(map);
    }
}
