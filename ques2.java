import java.util.*;
public class ques2 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<100){
          System.out.print("enter a number b/w 1 and 10:");
          int value=sc.nextInt();
          
          if(value >0 && value <11){
            System.out.println(value + " is b/w 1 and 10");
            break;
          }
          i++;
        }
    }
}
