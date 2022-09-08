package com.example.arrys;

public class ArrayExample {
    public static void main(String[] args) {
        int[] data= new int[5];
        data[0]=10;
        data[1]=20;
        data[2]=30;
        data[3]=40;
        data[4]=50;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
       // System.out.println(data[5]);//AIOBE

        float[] arr= {10.5f,12.5F,10.9f};

        System.out.println(arr.length);

       /* for (int i = 0; i < data.length; i++) {

            System.out.println(data[i]);

        }*/

/*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }



    }
}
