import java.util.Scanner;

public class task4If {
    public static void main(String[] args) {
        Task4If();
    }
    public static void Task4If() {
        System.out.println("Enter Day Number:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("1")){
            System.out.println("monday");
        }
        else if (input.equals("2")){
            System.out.println("tuseday");
        }
        else if (input.equals("3")){
            System.out.println("wednesday");
        }
        else if (input.equals("4"))
            System.out.println("thursday");
        else if (input.equals("5"))
            System.out.println("friday");
        else if (input.equals("6"))
            System.out.println("saturday");
        else if (input.equals("7"))
            System.out.println("sunday");
        else
            System.out.println("Wrong Day");
    }
}
