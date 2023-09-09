/*
      *********
     *********
    *********
   *********
  *********
 
 */ 

public class Main {
    public static void main(String[] args) {
       for (int i=1;i<=5;i++){
           for (int j=0;j<=6-i;j++) {
               System.out.print(" ");
           }

           for (int j=1;j<=11-(2*1);j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
