package numericalProblems;

import java.util.Scanner;

public class primeNumber {

    public static int prime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i =2 ; i <n/2 ;i++){
               if(prime(i) ==0){
                if(prime(n-i)==0){
                    System.out.println(prime(i) + " + " +prime(n-i) + " = " + n);
                }
               }
        }
    }

}
