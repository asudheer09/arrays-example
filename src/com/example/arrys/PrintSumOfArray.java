package com.example.arrys;

public class PrintSumOfArray {

    public static void main(String[] args) {
        int[] data={10,20,30,40};
        int sum=0;


        for (int i = 0; i < data.length; i++) {
            sum=sum+ data[i];
        }

        System.out.println("sum of array numbers is "+sum);
    }




}
