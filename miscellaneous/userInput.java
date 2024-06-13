package miscellaneous;
import java.util.*;
public class userInput {
    public static void main(String[]args){
    System.out.println("taking user input");
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = a+b;
System.out.println(c);
    }
}
