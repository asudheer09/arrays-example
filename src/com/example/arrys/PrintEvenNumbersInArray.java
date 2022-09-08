package com.example.arrys;

public class PrintEvenNumbersInArray {

    public static void main(String[] args) {

        int[] data= {11,12,13,14,16,15,-18,-17};

        for (int i = 0; i < data.length; i++) {

            if(data[i]%2==0){
                System.out.println(data[i]);
            }
        }


    }
}
