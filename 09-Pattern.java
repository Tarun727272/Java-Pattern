/*
        _____*****
        ____*****
        ___*****
        __*****
        _*****

  */

public class Main {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
           for (int j=1;j<=6-i;j++){
               System.out.print("_");
           }
           for (int j=1;j<=5;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
