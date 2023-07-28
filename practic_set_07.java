import java.util.Scanner;
public class practic_set_07 {
                        //Question 1;

//    public static void main(String[] args) {
   /*     Scanner sc =new Scanner(System.in);
        //System.out.println("Enter the value of that table which table you wants");
        System.out.println("What no of of row you wants to print: ");
        int n= sc.nextInt();
        //table(n);
        pattern(n);
    } */
//static void table(int n ){
//        for (int i=1;i<=10;i++) {
//            System.out.printf("%dx%d=%d \n" , n, i, n*i);
//        }

                //problem no 2
    static void pattern(int n){
        for (int i=0;i<=n;i++){
            for  (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        }

//                                    Question 2

    public static void main(String[] args) {
    int ans=febo(7);
        System.out.println(ans);
    }

    static int febo(int n){
    //return febo(n)=febo(n-1)+febo(n-2)
    if(n<2){
        return n;
    }
       return febo(n-1)+ febo(n-2) ;
}
    }

