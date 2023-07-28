/*what is array??
Array is nothing but a store a similar type of deta.*/

public class Array {
    public static void main(String[] args) {
//        there are three type of array we can write to store the data
//        1st type
//        int []marks={30,40,60,80};
//        System.out.println(marks[2]);

//        2nd type

//        int []marks; -- here we done the declaration
//        marks=new int [5]; --- here we have done the memory alocation

//        3rd type

//        int []marks=new int[5]; here we have done both things declaration and  memory allocation

//        int []marks={30,40,60,80};
//        System.out.println(marks.length);
//        String []name ={"souvik", "subhom","soumya","sovan"};
//        System.out.println(name[2]);

//        for(int i=0;i<marks.length;i++){
//        System.out.println(marks[i]);
//        }

        // write a java programme to display the value in reverse order

//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

//        this is the for each type of loop:

//        for (int element:marks) {
//            System.out.println(element);
//
//        }

        //Multidimensional array
        //This is 2-d array

        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println(flats.length);
        System.out.println(flats[1].length);

        for(int i=0; i<flats.length;i++){ //Here i mane rows and j mane Callum
        for (int j=0;j<flats[i].length;j++){ // Ekhane flats.length r value 3, i row r respect a likhthe hbe.i=0 thake sure korthe hobe.
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
    }


          }
}
