package QuickStatsJava;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuickStats {
    public static void main(String[] args) {
        int[] numbers = {3, 15, 2, 10, 6, 24};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Count: " + numbers.length);
        System.out.println("Total: " + Arrays.stream(numbers).sum());
        System.out.println("Average: " + Arrays.stream(numbers).average());
    }
}
