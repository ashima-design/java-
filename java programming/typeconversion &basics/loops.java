// while loop

// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//        int counter = 0;
//        while(counter < 100){
//         System.out.println("hello durgesh");
//         counter++;
//        } 
//     }
// }

// print num from 1 to 10
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         int counter = 1;
//         while( counter <= 10){
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }


// print num from 1 to n
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter range: ");
//       int range = sc.nextInt();
//       int counter = 1;
//       while(counter <= range){
//         System.out.println(counter);
//         counter++;
//       }
//     }
// }

// print sum of first n natural numbers
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sum = 0;
//       int i = 1 ;
//       while(i <= n ){
//         sum = sum + i ;
//         i++;
//       }
//       System.out.println("sum is : " +sum);
     
//     }
// }

// for loop
// print square pattern 
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//     for(int line = 1; line<=4 ;line++){
//         System.out.println("****");
//     }
//     }
// }

 // print reverse of a num
// public class loops{
//     public static void main(String args[]){
//        int n = 10889;


//        while(n > 0){
//         int lastDigit = n % 10;
//         System.out.println(lastDigit + "");
//         n = n / 10;
//        }
//        System.out.println();
//     }
// }

// print reverse the given num
// public class loops{
//     public static void main(String args[]){
//         int n = 10899;
//         int rev = 0;
//         while(n > 0){
//             int lastDigit = n % 10;
//             rev = ( rev * 10) + lastDigit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }

// do while loop
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//         int counter = 1;
//         do{
//             System.out.println("hello world");
//             counter++;
//         }while(counter <= 10);
//     }
// }

// break / continue statement
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//       for(int i = 1; i < 5; i++){
//         if(i == 4){
//             break;
//         }
//         System.out.println(i);
//       }
//       System.out.println("i am out of the loop");
//     }
// }

// keep entering numbers till user enters a multiple of 10
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//       Scanner sc = new Scanner (System.in);
//       do{
//         System.out.println("enter your number: ");
//         int n = sc.nextInt();

//         if(n % 10 == 0){
//             break;
//         }
//         System.out.println(n);
//       }while(true);
//     }
// }

// continue statement
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//      for(int i = 1; i <= 5; i++){
//         if (i == 3){
//             continue;
//         }
//         System.out.println(i);
//      }
//     }
// }

// display all numbers enteres by user except multiples of 10
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//      do{
//         System.out.println("enter your num : ");
//         int n = sc.nextInt();

//         if(n % 10 == 0 ){
//             continue;
//         }
//         System.out.println("num was :" +n);
//      }while(true);
     
//     }
// }

// check if num is prime or not
// import java.util.*;
// public class loops {
//     public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
        
//      boolean isPrime = true;
//      if(n == 2){
//         System.out.println("is prime.");
//      }else{
//         for (int i = 2; i <= Math.sqrt(n) ; i++ ) {
//             if(n % i == 0){
//                isPrime = false;
//             }
//         }
//         if(isPrime == true){
//            System.out.println("n is prime.");
//         }else{
//            System.out.println("n is not prime");
//         }
//      }
//     }
// }


// how many time hello is printed
// public class loops{
//     public static void main(String args[]){
//         for(int i = 0;  i <= 5; i++){
//             System.out.println("hello");
//             i+=2;
//         }
//     }
// }

// nested loops 
// public class loops{
//     public static void main(String args[]){
//         for(int line = 1; line <= 4; line++){
//             for(int star = 1; star <= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class loops{
//     public static void main(String args[]){
//         for(int line = 4; line >= 1; line--){
//             for(int star = line; star >= 1; star--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class loops{
//     public static void main(String args[]){
//         for(int line = 1; line <= 4; line++){
//             for(int num = 1; num <= line; num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }


// public class loops{
//     public static void main(String args[]){
//         for(int line = 4; line >= 1; line--){
//             for(int num = line; num >= 1; num--){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }


public class loops{
    public static void main(String args[]){
       int n = 4;
       char ch = 'A';
       for( int line = 1;line <= n; line++){
        for(int chars = 1; chars <= line; chars++ ){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
       }
    }
}
