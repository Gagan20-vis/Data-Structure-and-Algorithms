package com.company.Algorithms.Sorting;

public class QuickSort {
    public void sort(int[] arr)
    {
        quicksort(arr,0,arr.length-1);
    }

    protected int partition(int[] a, int low, int high)
    {
        int pivot = a[low];
        int i = low+1;
        int j = high;
        int temp;

        do
        {
            while (i <= high && a[i] <= pivot)
            {
                i++;
            }
            while (j >= low && a[j] > pivot)
            {
                j--;
            }
            if (i<j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while (i<j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }
    protected void quicksort(int[] a, int low, int high)
    {
        int partitionIndex;     //Index of pivot after partition

        if (low<high)
        {
            partitionIndex = partition(a,low,high);
            quicksort(a,low,partitionIndex-1);
            quicksort(a, partitionIndex+1,high);
        }
    }
}
