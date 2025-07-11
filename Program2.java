import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);

            if (i < num - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
