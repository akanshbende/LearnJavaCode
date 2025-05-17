package CollectionFramework.List.Vector;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        System.out.println("========Vector========");
        Vector<Integer> vector= new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("vector capacity : "+ vector.capacity());

        // -----------------

        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);

        Vector<Integer> v1=new Vector<>(ll);

        System.out.println(v1);

    }
}
