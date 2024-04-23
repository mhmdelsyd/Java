//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class occurrence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(first_occurraence(arr, 4));

    }

    static int first_occurraence(int[] arr, int element) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]==element) && i>=5)
            {
                temp=i;
                break;
            }

        }
        return  temp;
    }
}
