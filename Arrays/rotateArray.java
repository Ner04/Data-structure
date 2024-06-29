import java.util.Scanner;

public class rotateArray {
      public static void newRotatedArray(int[] arr ,int n ){
         int temp = arr[n-1];
         for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
         }
         arr[0]=temp;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        int k =sc.nextInt();

        for(int i =0;i<k;i++){
            newRotatedArray(arr,n);
            System.out.print("rotated by"+i);
            for(int j =0;j<n;j++){
                System.out.print(arr[j]+", ");
            }
        }
    

    for(int i =0;i<n;i++){
        System.out.println("rotated array"+arr[i]);
    }
}
}
