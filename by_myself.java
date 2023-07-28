
import java.util.Scanner;
public class by_myself {
    public static void main(String[] args) {

                //Question 1
       /* int a[]={25,20,30,40};
        int sum=0;
        for (int element:a
             ) {
         sum=sum+element;
        }
        System.out.println(sum); */

                        //Question 2

     /*   int a[]={25,20,30,40};
            int b=240;
            boolean isinarray=false;
        for (int element:a) {
            if (b==element) {
                isinarray=true ;
                break;
            }
        }
        if (isinarray){
            System.out.println("Integer is present");
        }
else{
            System.out.println("Integer is not present");

}
*/


                                //problem 3

    /*    int []marks={65,70,72,50,48,82};
        int sum=0;
        for (int element:marks
             ) {
            sum=sum+element;
        }
        System.out.println("This  is your avg marks: " + sum/marks.length);
*/
                        //problem-4
        int [][]a=new int[2][2];
        int [][]b=new int[2][2];
        int [][]c=new int[2][2];
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of your 1st matrix: ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }


        System.out.println("Enter the value of your 2nd matrix: ");
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                b[i][j]=sc.nextInt();
                System.out.print(b[i][j] +" ");
            }
            System.out.print("\n");
        }


        System.out.println(" the sum of 3rd matrix is : ");
        for (int i=0;i<c.length;i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print( c[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
    }
