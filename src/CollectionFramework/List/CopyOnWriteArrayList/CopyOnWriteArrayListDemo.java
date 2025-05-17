package CollectionFramework.List.CopyOnWriteArrayList;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    private static volatile boolean stop = false;
    public static void main(String[] args) {// "Copy on Write" means that whenever a write operation
// Like adding or removing an element
// instead of directly modifying the existing list
// a new copy of the list is created, and the modification is applied to that copy
// This ensures that other threads reading the list while it's being modified are unaffected.

// Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
// Write Operations: A new copy of the list is created for every modification.
//                    The reference to the list is then updated so that subsequent reads use this new list.
// notepad :

        //  CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: " + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
// Try to modify the list while reading
            if (item.equals("Eggs"))
                shoppingList.add("Butter");
            System.out.println("Added Butter while reading.");


// purani = new
            System.out.println("Updated Shopping List: " + shoppingList);

        }

// ====================THREADS==========================
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");




            Thread readerThread = new Thread(() -> {
                try {
                    while (!stop) {
                        for (String item : sharedList) {
                            if (stop) break; // Check again inside loop
                            System.out.println("Reading item: " + item);
                            Thread.sleep(100); // Simulate work
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println("Reader thread interrupted.");
                }
            });


        Thread writerThread = new Thread( () -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");

                Thread.sleep(500);
                stop = true; // Signal to stop
                System.out.println("Signaled threads to stop.");
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        });

                readerThread.start();
                writerThread.start();

        // Wait for threads to finish
        try {
            readerThread.join();
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");

    }
}
