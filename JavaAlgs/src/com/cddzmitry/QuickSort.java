package com.cddzmitry;

public class QuickSort {
    public static void main(String[] args) {
        int [] Arr = {20,35,-15,7,55,1,-22};

        quickSort(Arr,0,Arr.length);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }

    }

    public static void quickSort(int[] input,int start,int end) {

//        one element
        if(end-start < 2){
            return;
        }
//        if longer we needc to find pivont

        int pivotIndex = partition(input,start,end);
//        two parts of array are going back to quick sort recursievly
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }

    public static int partition(int[] input,int start,int end){
//        first element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;
//        i left to right
//        j right to left
//        and we treverse it untill they cross each other

        while (i < j){

//            empty loop body to keep decrementing j
            while (i < j && input[--j] >= pivot);
            if(i < j ){
//                find first element that less then the pivot
                input[i] = input[j];

            }
//            empty body loop
            while( i < j && input[++i] <= pivot);

//            WE are not loosing any data because we treverse back an forth
            if(i < j){
                input[j] = input[i];

            }

        }
//        i hit j! j will be an index where we insert pivot
        input[j] = pivot;
        return j;
    }
}
