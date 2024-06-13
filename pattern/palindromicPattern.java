package pattern;
import java.io.*;
public class palindromicPattern {
    public static void main(String[]args){
    int n=5;
    int m=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<(n-i);j++){
            System.out.print(" ");
        }
        for(int j=m;j>0;j--){
            System.out.print(j );
        }
        for(int j=1;j<=i;j++){
            System.out.print(j+1);
        }
        m++;

        System.out.println();
    }
    }
}


/*
       1
     2 1 2
   3 2 1 2 3
 4 3 2 1 2 3 4

 */