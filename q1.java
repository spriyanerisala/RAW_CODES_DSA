
class q1{
  public static void increasingOrder() {
         int i;
        System.out.print("Increasing order : ");
        for( i=1;i<100;i++){
            if(i%2==0){
              System.out.print(i+" ");
            }
        }
    }

     public static void decreasingOrder() {
         int i;
        System.out.print("Decreasing order : ");
        for( i=100;i>1;i--){
            if(i%2==0){
              System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
       
       increasingOrder();
       System.out.println();
       decreasingOrder();
   }
}