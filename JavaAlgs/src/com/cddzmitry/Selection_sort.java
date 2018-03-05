package com.cddzmitry;

public class Selection_sort {

    public static void main(String[] args) {
        // write your code here

        int [] Arr = {20,35,-15,7,55,1,-22};


        for (int lastUnsortedIndex = Arr.length -1; lastUnsortedIndex >0  ; lastUnsortedIndex--) {


            int largest = 0;

            for (int i = 0; i <= lastUnsortedIndex ; i++) {

                if(Arr[i] > Arr[largest]){
                    largest  = i;
                }
            }

            swap(Arr,largest,lastUnsortedIndex);

        }

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }

    }

    public static void swap(int[] array, int i , int j) {

        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
