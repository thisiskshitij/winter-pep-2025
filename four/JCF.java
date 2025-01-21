// import java.util.*;

// public class JCF {

//     public static void main(String[] args) {
//         // List Interface

//         // ArrayList is an Implementation of List Interface.
//         ArrayList groceryList = new ArrayList();

//         groceryList.add("milk");
//         groceryList.add("rusk");
//         groceryList.add("butter");
//         groceryList.add(1100);
//         groceryList.add(23.44);

//         System.out.println(groceryList);

//         // get method for accessing element at a particular index.
//         System.out.println(groceryList.get(1));

//         System.out.println("Total Elements " + groceryList.size());
//         // removing element
//         groceryList.remove(3);
//         System.out.println(groceryList);

//         // looping through list

//         for (int i = 0; i < groceryList.size(); i++) {
//             System.out.println(groceryList.get(i));

//             // enhanced for loop
//             for (Object obj : groceryList) {
//                 System.out.println(obj);

//             }
//         }
//     }
// }




import java.util.*;

public class JCF {
    public static void main(String[] args) {
        // LinkedList is a subset of List Interface.
        // This time we will experience Generic collection.

        ArrayList<Integer> mylist = new ArrayList<>();
        LinkedList<Integer> priceList = new LinkedList<>();

        // Adding elements to the LinkedList
        priceList.add(101);
        priceList.add(102);
        priceList.add(103);
        priceList.add(104);
        priceList.add(105);

        // Uncommenting this will cause a compilation error as LinkedList<Integer> does not accept Strings
        // priceList.add("hello"); 

        System.out.println("Total Elements: " + priceList.size());

        // Get element
        System.out.println("First element: " + priceList.get(0));

        // Remove elements
        priceList.remove(0);
        System.out.println("After Removal, Total Elements: " + priceList.size());

        // Iterate through elements using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (Integer i : priceList) {
            System.out.println(i);
        }

        // Iterate through elements using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> it = priceList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
