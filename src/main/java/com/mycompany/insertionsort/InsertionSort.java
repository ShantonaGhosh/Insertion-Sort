package com.mycompany.insertionsort;

public class InsertionSort {

    public static void printArray(String msg, int[] list) {
        System.out.println(msg);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] list = {1,6,34,0,2,89};

        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] < temp) {
                list[j + 1] = list[j];
                j = j - 1;

            }
            list[j + 1] = temp;

            printArray( " i : " + i + " j : " + j + " temp : " + temp, list);
        }
         printArray("final list", list);

    }
}
