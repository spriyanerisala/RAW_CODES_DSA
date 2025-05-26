import  java.util.*;
public class q5 {
    public static void sum(){
        Scanner sc=new Scanner(System.in);
          String number = sc.next();
       
        int sum=0;
        String[] parts=number.split("");
          int[] arr = new int[parts.length];
         
          for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        
          }
          for(int num:arr){
            System.out.print(num);
          }
          for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum : " + sum);
    }
    public static void main(String[] args) {
        sum();
    }
}
