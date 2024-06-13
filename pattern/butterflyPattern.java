package pattern;
import java.io.*;
public class butterflyPattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to make a larger or smaller pattern
        
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




/*

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
  
 */