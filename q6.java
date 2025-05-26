import java.util.*;
public class q6 {
public static void example1(){
    Scanner sc=new Scanner(System.in);
    String value = sc.next();
    String[] arr= value.split("");
    for(String i : arr){
        System.out.print(i);
    }
           System.out.println();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
    }
}
public static void example2(){

    Scanner sc=new Scanner(System.in);
    String value = sc.next();
    char[] arr = value.toCharArray();
    for(char i : arr){
        System.out.print(i);
    }
    System.out.println();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
    }
}
public static void example3(){
    Scanner sc=new Scanner(System.in);
    String input=sc.next();//hello
   
    byte[] arr =input.getBytes();//['h','e','l','l','o']
    byte[] result = new byte[arr.length];
    for(int i=0;i<arr.length;i++){
        result[i]=arr[arr.length-i-1];
    }
    String text =new String(result);
    System.out.print("Reversed : " + text);
   System.out.println();
   
} 
public static void example4(){
    Scanner sc=new Scanner(System.in);
     String b = sc.next();
    StringBuilder sb = new StringBuilder();
   
    sb.append(b);
    sb.reverse();
    System.out.println("Reversed text : "+sb);
}
public static void main(String args[]){
    //example1();
   // example2();
   //example3();
   example4();
        }
 }
    


