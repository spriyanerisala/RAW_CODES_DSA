
import java.util.Scanner;

public class q4 {
    public static void maxAndMin(){
        Scanner sc =new Scanner(System.in);
        int value;
        int i=0,small=Integer.MAX_VALUE,large=Integer.MIN_VALUE;
        while(i<100){
             value = sc.nextInt();
             System.out.print(value + " ");
            if(value  > 0){
                if(value < small){
                    small =value;
                }
                if(value > large){
                    large = value;
                }
            }else{
                break;
            }
            
            i++;

        }
        System.out.println();
        System.out.println("Min : "+ small);
        System.out.println("Max : "+ large);
    }
    public static  void main(String args[]){
      maxAndMin();
    }
    
}
