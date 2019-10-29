package com.company;

public class Main {

    public static void merge(int a[],int l,int m,int h) {
        int i, j, c=l;
        int b[]=new int[h+1];

        for(i = l,j = m+1; i<=m && j<=h; c++) {

            if(a[i] <= a[j]) {
                b[c] = a[i++];
            }else {
                b[c] = a[j++];
            }
        }
        while(i <= m ) {
            b[c++] = a[i++];
        }
        while(j<=h) {
            b[c++] = a[j++];
        }

        for(i = l ; i <= h; i++) {
            a[i] = b[i];
        }
    }

    public static void Sort(int a[],int l,int h) {
        if(l<h) {

            int m=(l+h)/2;
            Sort(a,l,m);
            Sort(a,m+1,h);
            merge(a,l,m,h);

        }


    }

    public static void printArray(int a[]) {

        for(int i=0; i < a.length; i++) {

            System.out.print(a[i]+"  ");
        }

    }
    public static void main(String[] args) {

        int [] a = {26, 46, 98, 0, 899, 6, 99, 89, 74};
        int n = a.length;

        System.out.println( "Исходный массив:  ");
        printArray(a);
        Sort(a,0,n-1);
        System.out.println( "\nОтсортированный массив:  ");
        printArray(a);

    }
}
