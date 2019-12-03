package com.company;

public class Main {

    public static void main(String[] args) {

    //opdracht 1 bereken Order

//    long result;
//    int input;
//
//    input = 10; //enter input here
//
//    chapter1 c1 = new chapter1();
//
//    result = c1.asssignment1JobA(input);
//
//    System.out.println(result);


    // Opdracht 2 bubble sorter

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        chapter1 c1 = new chapter1();

        c1.bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }





    }


}
