package pattern;
import java.io.*;
import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //breadth
        int m = sc.nextInt(); //length

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
