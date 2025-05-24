import java.util.*;
 class q1OnWhile {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
         System.out.print("enter a number blw 1 and 10 :  ");
       int i=0;

       while(i<100){
               
              int value = sc.nextInt();
              if(value<10 && value > 0){
                System.out.println(value + "is b/w 1 and 10. Thank you");
                break;
              }
              System.out.print(value + "is not blw 1 and 10.Try again:");
              

       }
    }
}
