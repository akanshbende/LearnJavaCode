package CollectionFramework.List.Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========Linked List=========");

        LinkedList<Integer> linkedlist=new LinkedList<>();

        linkedlist.add(1);
        linkedlist.add(2);

        linkedlist.addFirst(0);
        linkedlist.addLast(3);

        System.out.println("getfirst : "+   linkedlist.getFirst() +'\n'+ "getlast : " + linkedlist.getLast());

        System.out.println(linkedlist);

//        linkedlist.remove(1);
//        System.out.println(linkedlist);

        linkedlist.removeIf(x -> x%2==0);// remove elements of even index
        System.out.println(linkedlist);

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println(fruits);

        // Second LinkedList with fruits to remove
        LinkedList<String> removeFruits = new LinkedList<>();
        removeFruits.add("Banana");
        removeFruits.add("Orange");

        // Remove all elements from 'fruits' that are present in 'removeFruits'
        fruits.removeAll(removeFruits);

        // Output the remaining fruits
        System.out.println("Remaining Fruits: " + fruits);

    }


}
