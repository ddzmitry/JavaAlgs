package com.cddzmitry;

public class Shell_sort {

    public static void main(String[] args) {
//                Shell sort using gap
        int [] Arr = {20,35,-15,7,55,1,-22};
//        gap will presort to define gap we have to get length
//        and split it by 2

        for (int gap = Arr.length/2; gap >0 ; gap /=2 ) {

            for (int i = gap; i <Arr.length ; i++) {

                int newElement = Arr[i];
                int j = i;

//                gap will have a steps of Arr.length/2
//                and will move further and swap elements inplace
//                untill it hits 0
//                once this happened it will do new gap
//                once gap is 1 then we will proceed with regular insertion sort
                while (j >= gap && Arr[j-gap] > newElement){

                    Arr[j] = Arr[j - gap];
                    j -= gap;


                }
                Arr[j] = newElement;

            }

        }

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
}
