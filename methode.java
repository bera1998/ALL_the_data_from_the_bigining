import java.util.Arrays;
public class methode {
//    static int name(int x, int y){ //We are doing the same if we not write the static.then this methode
//                                    //called the function by the calling of object.this case we have to create the object.
//        int z;                      // int name(int x,int y){
//                                            // }
//        if(x>y){
//            z=(x+y)*8;
//        }
//    else {
//        z=x*y;
//        }
//    return z;
//    }
//    public static void main(String[] args) {
//int a=5;
//int b=8;
//int c;
//c=name(a,b);
////methode obj=new methode();
////c=obj.name(a,b); this type is also called the function by the crating the object.
//        System.out.println(c);

   /* public static void main(String[] args) { // always main function will execute first.
                                            // keep it in mind.
        //String b=name();
        System.out.println(name());
    }
 static String name(){ //IF we are type data type over here is string /int /float
                        // then also return data type also be same if not it will through an error.
        String a= "souvik";
        return a; */    // when we are telling return a
                       // that's means we are telling that returning the value of a then that value will save in the methode after that
                       //when we called the methode than methode is print the value of return .



                    // pass the argument int type

   /* public static void main(String[] args) {
        System.out.println("the value of the sum of a and b is :" + sum(55,62));
    }
  static int sum(int a,int b){ // this is how we pass the arguments  through methode.
 int total=a+b;
 return total; */


                        // pass the argument string type

    public static void main(String[] args) {
    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();
        System.out.println(great(name));
    }
  static String great(String name){
       String greating = "Hellow "+ name ;
        return greating ; */
                                // How to change the value in function
        int[]arry={1,40,78,79,99};
        chng(arry);
        System.out.println(Arrays.toString(arry));
    }

static void chng(int[] nums){

       nums[1]=75;
}
}



