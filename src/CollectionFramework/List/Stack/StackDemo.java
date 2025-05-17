package CollectionFramework.List.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        Integer removedElement= stack.pop();

        System.out.println(stack);
        System.out.println(removedElement);


        Integer topElement= stack.peek();
        System.out.println(topElement);

        System.out.println(stack.isEmpty()?"Yes":"No");

        System.out.println("Stack Size : " + stack.size());

        System.out.println("Element is on " + stack.search(3) + " Position from top."); // Return position of search element from top

        // Linked List as Stack

        LinkedList lls=new LinkedList<>();

        lls.addLast(1);
        lls.addLast(2);
        lls.addLast(3);
        lls.addLast(4);

        System.out.println("Linked List as Stack : "+ lls);
        lls.removeLast();

        System.out.println(lls);
        System.out.println(lls.size());
        System.out.println(lls.isEmpty());


        // ArrayList as Stack

        ArrayList<Integer> als=new ArrayList<>();

        als.add(14);
        als.add(29);
        als.add(40);


        System.out.println(als);
        als.get(1);
        int topElement1= als.get(als.size()-1);
        als.get(als.size()-1); // peek
        als.remove(als.size()-1); // pop

       // System.out.println(topElement1);



    }
}
