
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a text : ");
        String input = sc.next();
        int len = input.length();
       
        boolean palindrome=false;
        char[] arr =input.toCharArray();
        for(int i=0;i<input.length();i++){
          
            if(arr[i] == arr[input.length()-i-1]){
                System.out.print(arr[i]);
               if(i == len-1){
                palindrome=true;
               }
            }else{
                System.out.println("not a Palindrome");
                break;
            }
        }
        System.out.println();
        if(palindrome){
            System.out.println("Palindrome");
        }
        
    }
}
