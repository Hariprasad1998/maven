/*Author : Kaviya V
Description: To print Fibanoci series
 */
package Sample_Programs;

import java.util.Scanner;

public class Fibanoci {
    public static void main(String[] args) {
        System.out.println("Enter the lengthOfSeries");
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3 ;
        int lengthOfSeries;

        lengthOfSeries = sc.nextInt();
        for(int i=0;i<lengthOfSeries;i++) {
            System.out.print(n1 + " ");
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
    }
}
