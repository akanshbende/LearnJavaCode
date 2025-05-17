package GarbageCollection;

import java.lang.ref.WeakReference;

/*
* Garbage Collection is the automatic process of reclaiming memory used by objects that are no longer needed or accessible in the program.
*
*| Aspect              | Details                                              |
| ------------------- | ---------------------------------------------------- |
| What it does        | Frees memory by cleaning up unused objects           |
| When it runs        | Automatically, in the background                     |
| Can you control it? | You can suggest with `System.gc()`, but can’t force  |
| Benefit             | Prevents memory leaks and manages memory efficiently |

* */
public class GC {
    public static void main(String[] args) {
        Phone phone=new Phone("Apple","16 pro max");
        System.out.println(phone);
        phone=null;
        System.out.println(phone);


        // ------------------------------
        WeakReference<Phone> weakPhone = new WeakReference<>(new Phone("Apple","Weak 16 pro max"));
       // Phone ref = weakPhone.get(); // Strong Reference

        if (weakPhone.get() != null) {
            System.out.println("Phone is still alive: " + weakPhone.get());
        } else {
            System.out.println("Phone has been garbage collected.");
        }
        System.gc();

        try { Thread.sleep(10000); } catch (InterruptedException e) {}



        if (weakPhone.get() != null) {
            System.out.println("Phone is still alive: " + weakPhone.get());
        } else {
            System.out.println("Phone has been garbage collected.");
        }
    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
