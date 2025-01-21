// Author: Rajan
// Description: This Program Explains Terminal Operations using Java Streams

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program3 {

    public static void main(String[] args) {

        // Collect (): to collect elements into a Collection.
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        Set<String> nameSet = names.stream().collect(Collectors.toSet());

        System.out.println(nameSet);

        String concatenatedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // For Each: it applies a given action for each element.
        names.stream().forEach(name -> System.out.println(name));
    }
}
