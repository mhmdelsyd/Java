import java.io.FileInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task2 {
    public static void main(String[] args) {
            try{
                FileInputStream file = new FileInputStream("D:\\Java\\Exception\\Task2_exception\\ Lincoln.txt");
                int WordsCount = 0;
                int i =0;
                while ((i=file.read())!=-1){
                    var Character = (char)i;
                    if(Character== ' ')
                        WordsCount++;

                }
                System.out.println(WordsCount);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
