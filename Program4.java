import java.util.*;

public class Program4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);


        int[] result = new int[10];


        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            result[i] = count;
            System.out.println(i + ": " + result[i]);
        }
    }
}