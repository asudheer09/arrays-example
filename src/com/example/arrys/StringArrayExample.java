package com.example.arrys;

public class StringArrayExample {
    public static void main(String[] args) {
        char[] chars={'a','e','i','o','u'};

        /*for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }*/

        String[] names={"asr","ksr","tan","kb"};
      /*  for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/

        String name="sudheer";
        char[] data=name.toCharArray();
        // int --->    Integer
        // float --->  Float
        // char---->   Character
        //boolean ---> Boolean
        //long    ---> Long
        //double  ---> Double

       /* for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }*/

        for (int i = data.length-1; i >=0 ; i--) {
            System.out.println(data[i]);
        }


        /* System.out.println(""+'i');

        char ch= 'p';
        String s=""+ch;
        System.out.println(s);*/
        System.out.println(1+2+"abc"); //3abc
        System.out.println("abc"+1+2);//abc12

    }
}
