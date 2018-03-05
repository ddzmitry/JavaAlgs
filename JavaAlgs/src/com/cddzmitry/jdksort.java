package com.cddzmitry;
import java.util.Arrays;

public class jdksort {


    public static void main(String[] args) {
        int [] Arr = {20,35,-15,7,55,1,-22};
        Arrays.sort(Arr);
//        Arrays.parallelSort(Arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
}
