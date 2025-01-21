

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Program5 {

    LinkedHashSet<String> itemset = new LinkedHashSet<>();

    void linkedHashSetDemo() {
        itemset.add("orange");
        itemset.add("orange"); // Duplicate, won't be added
        itemset.add("apple");
        itemset.add("orange"); // Duplicate, won't be added
        itemset.add("apple");  // Duplicate, won't be added
        itemset.add("kiwi");

        // Printing set elements
        Iterator<String> it = itemset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new Program5().linkedHashSetDemo();
    }
}
