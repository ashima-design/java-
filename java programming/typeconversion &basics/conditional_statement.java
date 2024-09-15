
// public class conditional_statement {
//      public static void main (String args[]) {
//         int age = 18;
//         if( age >= 18){
//           System.out.println("you can vote orr drive ^^");
//         }
//         else {
//           System.out.println("you cannot vote or drive because you are not eligible.");
//         }
//      }
// }

// print a is greater then b
// public class conditional_statement{
//      public static void main (String args[]) {
//         int a = 1;
//         int b = 2;
//         if(a >= b){
//           System.out.println("b is greater then and equal to a");
//         }
//         else{
//           System.out.println("a is greater then b");
//         }
//      }
// }


// print if a num is odd orr even 
// import java.util.*;
// public class conditional_statement {
//           public static void main (String args[]) {
//              Scanner sc = new Scanner(System.in);
//              int num = sc.nextInt();

//             if(num %2 == 0){
//                System.out.println("Even");
//             }
//             else{
//                System.out.println("odd");
//             }
//           }
//      }

//if-else-if
// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int income = sc.nextInt();
//         int tax;
//         if( income < 500000 ){
//             tax = 0;
//         }
//         else if( income >= 500000 && income <= 1000000){
//             tax =(int) ( income * 0.2);
//         }
//         else {
//             tax =(int) ( income * 0.3);
//         }
//         System.out.println("your tax is : " + tax);
//     }
// }

//find the largest num btw 3 
// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         // Scanner sc = new Scanner (System.in);
//         // int income = sc.nextInt();
//         int a = 30;
//         int b = 20;
//         int c = 10;
//         if (a >= b && a>=c){
//             System.out.println("a is largest");
//         } else if(b >= c && b <= a){
//             System.out.println("b is greater then c and smaller then a");
//         }else if( c <= b && c <= a ){
//             System.out.println("c is smaller then a,b");
//         }else{
//             System.out.println("the three num are equal");
//         }

//     }
// }


// ternary operator
// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int num = sc.nextInt();
//     //   int num = 4;
//       String type = ((num % 2) == 0 ) ? "even" : "odd";
//       System.out.println(type);
//     }
// }


// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int marks = sc.nextInt();

//          String reportCard = marks >= 33 ? "pass" : "fail";
//          System.out.println(reportCard);
    
//     }
// }

// switch statement
// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int num  = sc.nextInt();

//          switch(num){
//             case 1 : System.out.println("smosa");
//                   break;
//             case 2 : System.out.println("lassi");
//                   break;
//             case 3 : System.out.println("momo");
//                   break;
//             default : System.out.println("idiot!! wake up you are dreaming");
//                   break;
//          }
//     }
// }

// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          char operator = sc.next().charAt(0);

//          switch(operator){
//             case '+' : System.out.println(a+b);
//                   break;
//             case '-' : System.out.println(a-b);
//                   break;
//             case '*' : System.out.println(a*b);
//                   break;
//             case '/' : System.out.println(a/b);
//                   break;
//             case '%' : System.out.println(a%b);
//                   break;
//             default : System.out.println("idiot!!your value is wrong");
//                   break;
//          }
//     }
// }


// practice questions
//  Write a Java program to get a number from the user and print whether it is
// positive or negative.

// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int num = sc.nextInt();
//          if(num > 0 ){
//             System.out.println("the given num is positive.");
//          }else{
//             System.out.println("the given num is negative.");
//          }
//     }
// }


// wap to print whether you have fever or not if your temprature is above 100 
// import java.util.*;
// public class conditional_statement{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          double temp = sc.nextInt();
//          if(temp > 100){
//             System.out.println("you have fever.");
//          }
//          else{
//             System.out.println("you dont have fever.");
//          }
//     }
// }


// WAP to input 1-7 num and print week days 
// we are going to use switch case
// import java.util.*;
// public class conditional_statement{
// public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter week day (1-7)");
//         int days = sc.nextInt();
//         switch(days){
//             case 1 : System.out.println("monday");
//                   break;
//             case 2 : System.out.println("tuesday");
//                   break;
//             case 3 : System.out.println("wednesday");
//                   break;
//             case 4 : System.out.println("thursday");
//                   break;
//             case 5 : System.out.println("friday");
//                   break;
//             case 6 : System.out.println("saturday");
//                   break;
//             case 7 : System.out.println("sunday");
//                   break;
//             default: System.out.println("idiot!! you entered wrong day");
//         }
//     }
// }

// WAP tp print whether a year is leap or not 
import java.util.*;
public class conditional_statement{
public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter year :");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0 ;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) &&  (year % 400 == 0);
        if( x && (y || z)){
            System.out.println(year + "the year is leap ");
        }else{
            System.out.println(year + "year is not leap");
        }
    }
}