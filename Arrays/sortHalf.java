import java.util.*;;

public class sortHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr= new int[n];
        
        for(int i =0;i<n;i++){
         arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=n ;i<=n/2;i--){
           arr[i]=arr[n-i];
        }
    }
}
