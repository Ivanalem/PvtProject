package task10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<Object> myNewList = myList.stream()
                .filter(m -> !m.contains("3"))
                .sorted(Comparator.comparing(m -> m.charAt(1)))
                .skip(1)
                .sorted(Comparator.comparing(m -> ((String)m).charAt(0)).reversed())
                .skip(1)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(myNewList.toArray()) + " " + myNewList.toArray().length);
    }
}
