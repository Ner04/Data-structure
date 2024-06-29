import java.util.Scanner;

public class numberFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array intializing 
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //getting the number to find 
        System.out.print("Enter the number to search:");
        int num = sc.nextInt();
        int count=0;
        
        //finding the number 
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                System.out.println("number found and the index number is "+i);

                count++;
            }
        }
        
        //if the number isn't found
        if( count ==0){
            System.out.println("number is not present in the array");
        }
        
    }
}
