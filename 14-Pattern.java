/*

*****
*  *
* *
**
*

*/

public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=6-i;j++){
                if (i==1 || i==5 || j==6-i || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
