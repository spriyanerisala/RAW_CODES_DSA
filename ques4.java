import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter 4 digit number : ");
      String number = sc.next();
      if(number.length() !=4){
        System.out.println("Please enter 4 digit number");
      }
      int value = Integer.parseInt(number);
      int a=value/1000;
      int b=(value/100)%10;
      int c=(value/10)%10;
      int d=value%10;
      if((a+b) == (c+d)){
        System.out.println("Lucky Number");
      }else{
        System.out.println("Not a Lucky Number");
      }
    }

   
}
