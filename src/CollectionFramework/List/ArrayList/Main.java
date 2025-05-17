package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===ArrayList===");

        List<String> list= new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1= Arrays.asList("Monday","Tuesday"); // can set elements but not add elements
        System.out.println(list1.getClass().getName());
        list1.set(1,"Wednesday");
        System.out.println(list1.get(1));

       // list1.add("Friday");  // gives error

        String[] array= {"Apple","Banana","Cherry"};
        List<String> list2=Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        //list2.set(1,"Mango");
        //list2.add(1,"Mango"); // gives error - cannot add/remove
        //list2.remove(1);      // gives error - cannot add/remove

        List<String> list4=new ArrayList(list2);

        list4.add(1,"Mango");

        System.out.println("list4 :"+ list4);

        System.out.println("list2 :" +list2);

        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(1);

        List<Integer> list5 =List.of(1,2,3,4); // UnsupportedOperationException
        //  list5.set(1,6);  // gives error
        //list5.add(9);

        System.out.println("list5 :"+list5);

        list3.addAll(list5); // copy elements of 1 array to another

        System.out.println(list3);
        // ----------------------------

        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        List<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Apple"); // remove first object
        System.out.println("Fruits: " + fruits);

        nums.remove(1);// removes element of indedx 1;
        System.out.println("nums :"+nums);

        nums.remove(Integer.valueOf(1));// remove the element '1'.

        System.out.println("nums :"+nums);

        // Convert list to Array

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Pineapple");
        fruits1.add("Mango");
        fruits1.add("Banana");
        fruits1.add("Orange");

       //Object[] arr =fruits1.toArray();
        //System.out.println(arr);
       // String[] strArr=fruits1.toArray(fruits.toArray(new String[0]));

//        for (int i=0;i<strArr.length;i++)
//        {System.out.println(strArr[i]);}
        System.out.println(fruits1);
        fruits1.sort(null);
        System.out.println(fruits1);


// ===========COMPARATOR==============
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(37);
        numbers.add(42);
        numbers.add(58);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(numbers);

























//        ArrayList<Integer> list=new ArrayList<>(11);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        System.out.println(list);
//        System.out.println(list.size());


    }

}
