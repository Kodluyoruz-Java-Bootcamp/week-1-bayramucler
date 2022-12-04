package h1_s2;

public class PrintTriangle {
    public static void main(String[] args){
        printLeftTriangle();
        printrightTriangle();
   }


   public static void printLeftTriangle(){
       for(int i=0; i<5; i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }

    public static void printrightTriangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++)
                System.out.print(" ");

            for (int k = 0; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
