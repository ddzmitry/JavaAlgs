package com.cddzmitry;

public class Insertion_sort {



    public static void main(String[] args) {
        int [] Arr = {20,35,-15,7,55,1,-22,};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < Arr.length; firstUnsortedIndex++) {

            int newElement = Arr[firstUnsortedIndex];

            int i;
            //            if  -15 less thn 35 -15 is taking position of 35, if -15 less then
            // 20 it will shift to 0
            for (i = firstUnsortedIndex; i > 0 && Arr[i-1] > newElement; i--) {

                Arr[i] = Arr[i-1];

            }

            Arr[i] = newElement;

        }

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
}
