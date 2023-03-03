package com.company.DataStructure;

import java.util.Scanner;

public class Array {
    int size;
    int[] arr;
    public Array(int size){
        size = this.size;
        arr = new int[size];
    }
    public static void main(String[] args) {
        java.util.Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        //Array Declaration - int[] arr;
        int[] arr;
        //Array Creation - arr = new[10];
        arr = new int[size];

        //Array Initialization = arr[0] = 1;
        arr[0] = 1;

        //Array Traversing
        System.out.println(arr[0]);

        //2D array

        //Array Declaration - int[] arr;
        int[][] arr2;

        //Array Creation - arr = new[10];
        arr2 = new int[size][size];

        //Array Initialization = arr[0] = 1;
        for(int i =0;i<size;i++)
        {
            for (int j = 0; j < size; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        //Array Traversing
        for(int i =0;i<size;i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
