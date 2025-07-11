import java.util.Scanner;

public class Program1 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();

        System.out.println("Choose the type of Operations");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        sc.nextLine();
        String Operation = sc.nextLine();

        double result;
        switch (Operation){
            case "1":
                result=a+b;
                System.out.println(result);
                break;
            case "2":
                result=a-b;
                System.out.println(result);
                break;
            case "3":
                result=a*b;
                System.out.println(result);
                break;
            case "4":
                if(b!=0) {
                    result = a / b;
                    System.out.println(result);
                }else{
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();

    }
}
