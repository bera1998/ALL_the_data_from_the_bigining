
import java.util.Scanner;
public class practice_set_6 {
    public static void main(String[] args) {


                //Question no -1

//        float sum=0;
//        float []marks={50.2f ,60.9f, 85.8f, 40.5f};
//        for (float element:marks) {
//            sum = sum+ element;
//        }
//        System.out.println(sum);

        //Question-2

        /*IS the value is present in the array??*/

      /*  float []marks={50.2f ,60.9f, 85.8f, 40.5f};
        float num=40.5f;
        boolean isInArray=false;
        for (float element:marks) {
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("the value is present in the array");
            }
        else {
            System.out.println("value is not present in the array");
        }*/


                        //Question-3
        /* int []phys={98,50,62,58};
        int sum=0;

        for (int element:phys)
        {
            sum=sum+element;

        }

        System.out.println("the avg will be: " + sum/phys.length);*/


                    //Question-4
        //Add the TWO MATRIX!

      /*  int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.println("enter the value of 1st matrix ");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                a[i][j]=r.nextInt();
                System.out.print( a[i][j] +" ");
            }
            System.out.print("\n");
        }

        System.out.println("enter the value of 2nd matrix ");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++) {
                b[i][j] = r.nextInt();
                System.out.print( b[i][j] +" ");
            }
            System.out.print("\n");
        }

        System.out.println("this the value of addition of two matrix ");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++) {
                c[i][j]=a[i][j]+b[i][j];

                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }  */


                    //Question-5

        //swap the array

    /*    int a[]={10,15,20,30,50};
        int l=a.length;
        int tem;
        int n= Math.floorDiv(l,2); // math.floorDiv sent-ext r kaj holo point value nah rakhe int r max value tah dewa jemon 5/2=2.5 nah dea only 2 dei.
        for (int i=0;i<n;i++){
            tem=a[i];
            a[i]=a[l-i-1];  // this the swap formula of array its normal like if we take two bowl to swap properly we have to take 3 bowl one is empty like
                            // a
                            //|a=5| |b=6|  |empty| if we want to swap the bowl 1st a=5 put into the empty bowl and then b=6 in ist bowl then we have to put
                            // a=5 in second bowl from empty bowl. that is the whole process we do here for swap.
            a[l-i-1]=tem;
        }
        for (int element:a)
        {
            System.out.print(element+" ");
        } */


                                                    //Question-6


       /* int a[]={10,15,20,30,50};
        int sum=0;
        for (int element:a)
        {
        if(element>sum){
            sum=element;
        }
        }
        System.out.println("This is your max value : " + sum); */


                                                    //Question-7


        /* int a[]={10,455,20,1};
        int min=Integer.MAX_VALUE;
        for (int element:a)
        {
            if(element<min){
                min=element;
            }
        }
        System.out.println("This is your min value : " + min); */


                                                                    //Question-8


        int a[]={50,20,80,100,40};
        boolean Issorted=true;
        for (int i=0; i<a.length;i++){
            if (a[i]>a[i+1]){
               Issorted=false;
               break;
            }
        }
        if (Issorted){
            System.out.println("sorted");
        }

else {
            System.out.println("not sorted");
        }

    }
}
