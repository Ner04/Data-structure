import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c= arr[0];
        int d= 0;
        for(int i=1;i<n;i++){
          if(c>arr[i]){
            d=c; 
            c=arr[i];
          }
          else if ( arr[i])
        }
        System.out.println(d);
        
    }
}
