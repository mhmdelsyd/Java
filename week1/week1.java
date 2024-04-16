import java.util.Scanner;
public class week1{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        Task4If();
        Task4Switch();
    }
    public static void task1(){
        int age = 21;
        int height = 180;
        boolean Israining = true;
        String CityName = "Tanta";
        System.out.println(age + " " + height + " " +Israining+" "+CityName);
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
    public static void task3(){
        for(int i=1;i<=20;i++)
            if(i%2==0){
                System.out.println(i);
            }
    }
    public static void Task4Switch() {
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
    public static void Task4If() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.equals(1))
            System.out.println("monday");
        else if (input.equals(2))
            System.out.println("tuesday");
        else if (input.equals(3))
            System.out.println("wednesday");
        else if (input.equals(4))
            System.out.println("thursday");
        else if (input.equals(5))
            System.out.println("friday");
        else if (input.equals(6))
            System.out.println("saturday");
        else if (input.equals(7))
            System.out.println("sunday");
        else
            System.out.println("Wrong Day");
    }
}
