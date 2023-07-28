public class recursion {
   /* static void value_print(int a){
     if(a==0){      //this ia our base case after match this value we are not print anything
         return;
     }
        System.out.println(a); //here we do the print means we start the initial stage for fun;
     value_print(a-1); // here we do the recursion means we call the fun again.
    }
    public static void main(String[] args) {
      int x=5;
      value_print(x);
    } */
//    static void print_sum(int a, int n, int sum){
//        if (a==n)
//        {
//           sum=sum+a;
//            System.out.println(sum);
//            return;
//        }
//        sum=sum+a;
//        print_sum(a+1, n, sum);
//    }
//    public static void main(String[] args) {
//    print_sum(1,5,0);
//    }


    public static void main(String[] args) {
        sum(1,7,0);
    }

    static void sum(int a,int b, int sum){
       if (a==b){
           sum=sum+a;
           System.out.println(sum);
           return;
       }
        sum=sum+a;
        sum(a+1,b,sum);
    }
}
