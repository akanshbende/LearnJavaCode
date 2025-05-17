package Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/*
* EnumMap is a specialized Map implementation designed specifically for keys that are enums.
* It’s part of the Java Collections Framework and provides very fast and memory-efficient performance compared to other Map types when enum keys are used.
*
* | Feature                     | Description                                                     |
| --------------------------- | --------------------------------------------------------------- |
| **Keys must be enums**      | Only accepts enum types as keys                                 |
| **Ordered**                 | Maintains keys in the **natural order** of the enum declaration |
| **Fast & memory-efficient** | Internally uses an **array** — faster than `HashMap`            |
| **Null keys**               | ❌ Not allowed (throws `NullPointerException`)                   |
| **Null values**             | ✅ Allowed                                                       |

*
* Much faster than HashMap<Enum, ?> because:
Internally uses ordinal values of enum constants as array indices.
No hashing is needed.
Perfect for lookups based on enums (like days, states, commands, etc.)
* */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}
public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Gym");
        map.put(Day.WEDNESDAY, "Meeting");
        map.put(Day.FRIDAY, "Movie");
        map.put(Day.WEDNESDAY, "Date");

        System.out.println(Day.TUESDAY.ordinal());

        for (Day day : map.keySet()) {
            System.out.println(day + ": " + map.get(day));
        }
    }
}
