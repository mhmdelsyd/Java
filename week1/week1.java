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
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Wrong Day");
                break;
        }
    }
    public static void Task4If() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("monday"))
            System.out.println(1);
        else if (input.equals("tuesday"))
            System.out.println(2);
        else if (input.equals("wednesday"))
            System.out.println(3);
        else if (input.equals("thursday"))
            System.out.println(4);
        else if (input.equals("friday"))
            System.out.println(5);
        else if (input.equals("saturday"))
            System.out.println(6);
        else if (input.equals("sunday"))
            System.out.println(7);
        else
            System.out.println("Wrong Day");
    }
}