import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        task2();
    }
    public static void task2(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number :");
        double first = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second number :");
        double second = Double.parseDouble(scanner.nextLine());
        System.out.println("the sum :"+(first+second));
        System.out.println("the difference :"+(first-second));
        System.out.println("the product :"+(first*second));
        System.out.println("The Division:"+(first/second));
    }
}
