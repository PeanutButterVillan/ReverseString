package org.example;


import java.util.Scanner;

class Function2 {
    String FirstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Function2 c = new Function2();
        System.out.print(c.FirstReverse(s.nextLine()));
    }
}

