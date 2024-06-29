package numericalProblems;
import java.util.Scanner;

public class zeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //converting number to string 
        String numberStr = Integer.toString(n);
        
        // Replace all '0' characters with '1'
        String modifiedStr = numberStr.replace('0', '1');
        
        // Convert the modified string back to an integer
        int modifiedNumber = Integer.parseInt(modifiedStr);

        System.out.println(modifiedNumber);
    }
}
