import java.util.Scanner;

public class task4Switch {
    public static void main(String[] args) {
        Task4Switch();
    }
    public static void Task4Switch() {
        System.out.println("Enter Day Number:");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine().toLowerCase()) {
            case "1":
                System.out.println("monday");
                break;
            case "2":
                System.out.println("tuesday");
                break;
            case "3":
                System.out.println("wednesday");
                break;
            case "4":
                System.out.println("thursday");
                break;
            case "5":
                System.out.println("friday");
                break;
            case "6":
                System.out.println("saturday");
                break;
            case "7":
                System.out.println("sunday");
                break;
            default:
                System.out.println("Wrong Day");
                break;
        }
    }
}
