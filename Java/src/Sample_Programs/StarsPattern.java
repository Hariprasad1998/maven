//description= print the stars pattern
//Author= Deva Prasad
package Sample_Programs;

import java.util.Scanner;

public class StarsPattern {
    public static void main(String[] args) {

        System.out.println("Enter the of n");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)//row
        {
            for (int j=1;j<=n;j++)//column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
