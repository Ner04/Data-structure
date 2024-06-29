package numericalProblems;

import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        for(int i =n ;i>0;i=i/10){
            if(i%10 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
