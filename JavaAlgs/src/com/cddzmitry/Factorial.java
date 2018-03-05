package com.cddzmitry;

public class Factorial {


    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(recursionFactorial(11));

    }

    public static int factorial(Integer b) {

            if(b == 0){
                return b;
            }
            int facrotial = 1;
            for (int i = 1; i <= b; i ++ ){
                facrotial *= i;
            }

            return facrotial;
    }

    public static Integer recursionFactorial (Integer b) {

        if(b == 0){
            return 1;
        }
        return b * recursionFactorial(b-1);


    }

}
