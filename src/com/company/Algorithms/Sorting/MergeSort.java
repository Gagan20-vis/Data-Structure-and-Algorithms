package com.company.Algorithms.Sorting;

public class MergeSort {

    public void sort(int[] arr)
    {
        Divide(0,arr.length-1,arr);
    }

    protected void Merge(int low,int mid,int high,int[] arr)
    {
        int i = low,j = mid+1,k = low;
        int[] res = new int[low+high+1];

        while(i<=mid && j<= high)
        {
            if(arr[i] < arr[j])
            {
                res[k] = arr[i];
                i++;
            }
            else {
                res[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            res[k] = arr[i];
            k++;
            i++;
        }
        while(j<=high)
        {
            res[k] = arr[j];
            k++;
            j++;
        }
        if (high + 1 - low >= 0) System.arraycopy(res, low, arr, low, high + 1 - low);
    }
    protected void Divide(int low,int high,int[] arr)
    {
        if(low>=high)
        {
            return ;
        }
        else
        {
            int mid = (low+high)/2;
            Divide(low,mid,arr);
            Divide(mid+1,high,arr);
            Merge(low,mid,high,arr);
        }
    }
}
