import java.util.Scanner;
public class q8 {
    public static boolean  isPrime(int number){
if(number <=1 ){
            return false;
        }
        if(number == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i ==0 ){
                return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       if(isPrime(number)){
        System.out.println("Prime Number");
       }else{
        System.out.println("Not a Prime Number");
       }
        
    }
}
