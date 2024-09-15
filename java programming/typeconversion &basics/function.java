// public class function {
//     public static void printHelloWorld(){       //this is our function which we define 
//         System.out.println("Hello World");
//         return; 
//     }
//     public static void main(String args[]){
//          printHelloWorld();      //to call the function
//     }
// }


//function with parameters
// import java.util.*;
// public class function {
//     public static void printHelloWorld(){       //this is our function which we define 
//         System.out.println("Hello World");
//         return; 
//     }
//     public static void calculateSum(int a, int b) {  //passing parameters
//         int sum = a + b;
//         System.out.println("sum is :" +sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum(a, b);      //arguments 
//     }
// }

//swap (call by value )
// import java.util.*;
// public class function {
//       //swap
//     public static void swap(int a , int b){
//         int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a = " +a);
//        System.out.println("b = " +b );
//     }
//     public static void main(String args[]){
//        // swap values 
//        int a = 5;
//        int b = 10;
//       swap(a , b);   //call by value
//     }
// }


// product of two numbers
import java.util.*;
public class function{
    public static int product(int a , int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String args[]){
        int a  = 6;
        int b = 5;
        int mul = product(6,5);
        System.out.println("a * b = " +mul);
    }
}