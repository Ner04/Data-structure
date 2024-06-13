package pattern;
import java.util.*;

public class rightTria {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            //upper side triangle 
           for (int j=0;j<n-i ;j++){
            System.out.print(" ");
           }

           for(int j=0;j<i;j++){
           System.out.print("*");}

        System.out.println();
           }
    }
    
}
