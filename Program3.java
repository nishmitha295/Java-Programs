import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int count = (x % 2 == 0) ? x - 1 : x;

        for (int i = 0; i < count; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);

            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}

