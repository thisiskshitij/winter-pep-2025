//This programs explains the implementation of setInterface
//set interface is known for storing unique/distinct elements.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    HashSet<String> itemSet = new HashSet<>();

    void hashSetDemo() {
        itemSet.add("orange");
        itemSet.add("orange"); // Duplicate, won't be added
        itemSet.add("apple");
        itemSet.add("orange"); // Duplicate, won't be added
        itemSet.add("apple");  // Duplicate, won't be added
        itemSet.add("kiwi");

        // Printing set elements
        Iterator<String> it = itemSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new HashSetDemo().hashSetDemo();
    }
}
