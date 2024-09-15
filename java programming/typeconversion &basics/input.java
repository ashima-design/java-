//input in java scanner

import java.util.*;   //package is util

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();  // next only store the value until the space accure 
        // System.out.println(input);

        String name = sc.nextLine();  //nextLine is use to take the whole package  
        System.out.println(name);
    }
}
