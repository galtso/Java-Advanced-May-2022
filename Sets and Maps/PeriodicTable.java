package SetsAndMaps;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String[] line = scan.nextLine().split("\\s+");
            Collections.addAll(elements, line);
        }
        elements.forEach(e -> System.out.print(e + " "));
    }
}
