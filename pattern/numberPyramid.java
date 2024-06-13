package pattern;
import java.io.*;
public class numberPyramid {
    public static void main(String[]args){
      int n=5;
      int m=1;
      for(int i =0;i<n;i++){
        for(int j=0;j<(n-i);j++){
         System.out.print(" ");
        }

        for(int j=0;j<m;j++){
          System.out.print(m+" ");
        }
        m++;
        System.out.println();
      }
    }
}

/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
 
 */