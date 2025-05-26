import java.util.*;
public class q2 {

    public static  void sum(){
   Scanner sc=new Scanner(System.in);

   int i,sum=0;;
   for(i=0;i<100;i++){
       int value=sc.nextInt();
        sum = sum + value;
        if(sum > 100){
            System.out.println("Done");
            break;
        }
   }
    }
    public static void main(String[] args) {
        sum();
    }
}
