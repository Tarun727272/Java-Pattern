/* 01- 

Enter a character
    *
    * * * * *
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=scan.next().charAt(0);
//It will take to redundancy.
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");

        for(int i=0;i<5;i++){
//            System.out.println("*"); for next line
          System.out.print(ch+" ");  //in same line
        }


    }
}
