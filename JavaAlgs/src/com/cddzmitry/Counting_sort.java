package com.cddzmitry;

public class Counting_sort {

    public static void main(String[] args) {
        int[] Arr = {2,5,9,8,2,8,7,10,4,3};
        CountingSort(Arr,1,10);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }

//    we need rang
    public static void CountingSort(int[] Arr,int min,int max) {
//        create counting array
        int[] countArray = new int[(max-min) + 1];

        for (int i =0; i < Arr.length; i++){
//            piciking up index that we need to increment
            countArray[Arr[i] - min]++;

        }

        int j = 0;

//        now we can write output array
        for (int i =min; i <= max; i++){
                while (countArray[i - min   ] > 0){
                    Arr[j++] = i;
                    countArray[i-min] --;

                }
        }

    }


}
