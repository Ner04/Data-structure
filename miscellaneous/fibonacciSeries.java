package miscellaneous;
import java.util.*;;
public class fibonacciSeries {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a =1;
        int b =0;
        int c;
        int n = sc.nextInt();
        System.out.print(b+","+a);
        for(int i= 2;i<n;i++){
            c=a;
            a=a+b;
            b=c;
            System.out.print(","+a);
        }
    }
}
