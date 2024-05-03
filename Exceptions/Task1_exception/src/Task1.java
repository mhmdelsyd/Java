import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            try{
                System.out.println("Enter FirstNum:");
                int first = input.nextInt();
                System.out.println("Enter SecondNum:");
                int second = input.nextInt();
                System.out.println(("The sum is:"+(first+second)));
            }catch (InputMismatchException e){
                System.out.println(e);
            }
    }
}