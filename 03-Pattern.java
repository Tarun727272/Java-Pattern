/*         *
           * *
           * * *
           * * * *
           * * * * *
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=scan.next().charAt(0);

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");

            }
            System.out.println();
        }


    }
}
