public class sum_average {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12};
        sumAverage(arr);
    }
    public  static  void sumAverage(int[] arr){
        int sum=0;
        double average =0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average=(double)sum/arr.length;
        System.out.println("sum="+sum +"___ average = "+average);
    }
}
