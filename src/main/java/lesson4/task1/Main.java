package lesson4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Pear");
        list.add("Peach");
        list.add("Melon");

        String stringForRemove = "Pe";

        list.removeIf(x -> x.startsWith(stringForRemove));

        System.out.println(list);
    }
}