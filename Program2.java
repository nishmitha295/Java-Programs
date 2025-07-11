import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);

            if (i < x - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
