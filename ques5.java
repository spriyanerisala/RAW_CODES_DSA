import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        char operator = s.next().charAt(0);
        int c;
        switch(operator){
            case '+':
              c=a+b;
              System.out.println("Sum : "+ "" +c);
              break;
            case '-':
              c=a-b;
              System.out.println("Subtraction : "+ "" +c);
              break;
            case '*':
              c=a*b;
              System.out.println("Multiplication : "+ "" +c);
              break;
            case '/':
              c=a/b;
              System.out.println("Division : "+ "" +c);
              break;
            default:
              System.out.println("Invalid operator");       
        }
    }
}
