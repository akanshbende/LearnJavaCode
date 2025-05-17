package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Akansh");
        map.put(2,"Neha");
        map.put(3,"Akshit");


        System.out.println(map);

        String s=map.get(2); // O(1)
        System.out.println(s);

        System.out.println(map.containsKey(3));// O (1)
        System.out.println(map.containsValue("Akansh"));


// Set

        for(int i : map.keySet() ) {
            System.out.println(map.get(i));
        }
            Set<Map. Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry :entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);


        map.remove(3);
        System.out.println(map);

        map.remove("Nitin");
        boolean res= map.remove(3,"Nitin");
        System.out.println("Removed ? : "+ res)
        ;

    }
}
