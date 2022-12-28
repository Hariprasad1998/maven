package Sample_Programs;

import java.util.Scanner;

public class AddNumReturntype {
    static int add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the of a");
        int a= sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the of b");
        int b= sc1.nextInt();

        int c=a+b;
        return c;
    }
    public static void main(String[]args){
        int x=add();
        System.out.println("the result of x :"+x)  ;
    }
}
