package com.company;

public class chapter1 {

    public chapter1() {}


    public long asssignment1JobA (int input)
    {

        //   O=n

        //a
        long som = 0;
        int n = input; //input here
        for (int i = 0; i < n; i++) som++;

        return som;
    }

    public long asssignment1JobB (int input)
    {

        // O=n2

        //b
        long som = 0;
        int n = input;
        for ( int i = 0;  i < n; i++)
            for ( int j = 0; j < n; j++) som++;

        return som;
    }

    public long asssignment1JobC (int input)
    {

        // O=n3

        //c
        long som = 0;
        int n = input;
        for ( int i = 0; i < n; i++)
            for ( int j = 0; j < n * n; j++) som++;

        return som;

    }


    public long asssignment1JobD (int input)
    {

        // O = log n

        //D
        long som = 0;
        int n = input;
        for ( int i = 0; i < n; i++)
            for ( int j = 0; j < i; j++) som++;

        return som;

    }


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    System.out.println("changed: " + arr[j - 1] + " with  : " + arr[j]);

                }

            }
        }
    }
}
