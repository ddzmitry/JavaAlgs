package com.cddzmitry;

public class Merge_Sort {

    public static void main(String[] args) {
        int [] Arr = {20,35,-15,7,55,1,-22};


        merge_sort(Arr,0,Arr.length);

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }

    public static void merge_sort(int[] input,int start, int end) {

                if(end  - start <2){
                    return;
                }

//                partitioning an array
                int mid = (start + end)/2;
//                012 left
//        recursion  with splited array
                merge_sort(input,start,mid);
                merge_sort(input,mid,end);
                merge(input,start,mid,end);

    }

//            int [] Arr = {20,35,-15,7,55,1,-22};
    public static void merge(int[] input,int start,int mid,int end) {

//        we always sorting merged arrays
//        mid -1 last element in left partition
        if(input[mid-1] <= input[mid]){

            return;
        }

        int i = start;
        int j = mid;
        int tempIndex= 0;
//        declare new array
        int[] temp = new int[end-start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
//        handling the remaining elements
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
