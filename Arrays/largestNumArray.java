import java.util.Scanner;

public class largestNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
          arr[i] =sc.nextInt();
        }
         int num = arr[0];
        for(int i =1;i<n;i++){
            if (num<arr[i]){
                num=arr[i];
            }
        }
        System.out.println("largest number in the array: "+num);
    }
}
