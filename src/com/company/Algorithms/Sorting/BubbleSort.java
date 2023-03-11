package com.company.Algorithms.Sorting;

public class BubbleSort {
    public void sort(int[] arr)
    {
        sort(arr,arr.length);
    }
    protected void sort(int[] arr,int n)
    {
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
