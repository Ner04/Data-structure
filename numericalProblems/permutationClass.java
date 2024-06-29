package numericalProblems;

import java.util.Scanner;

public class permutationClass {
    public static int factUp(int n){
        if(n<=1){
            return 1;
        }
        else{
            return ( n * factUp(n-1));
        }
    }

    public static int factDown(int n , int r){
        if((n-r)<=1){
            return 1;
        }
        else{
            return((n-r)* factDown(n,r));
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  //number of students
    int r= sc.nextInt();   //number of seats 
    int res = factUp(n)/factDown(n, r);

    System.out.println(res);

   }
}
