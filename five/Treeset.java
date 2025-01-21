import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {

    TreeSet<String> itemset = new TreeSet<>();

    void sortedSetDemo() {
        itemset.add("orange");
        itemset.add("orange");
        itemset.add("apple");
        itemset.add("apple");
        itemset.add("kiwi");

        // Printing set elements
        Iterator<String> it = itemset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new Treeset().sortedSetDemo();
    }
}

