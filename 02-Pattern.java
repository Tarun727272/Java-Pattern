/*      * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character : ");
        char ch=scan.next().charAt(0);

        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
