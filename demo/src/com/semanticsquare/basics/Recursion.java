package com.semanticsquare.basics;

public class Recursion {
    
    static int factorielNR(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int factoriel = n;

        while(n >= 2) {
            factoriel *= n - 1;
            n--;
        }

        return factoriel;
    }

    static int factoriel(int n) {
        if(n == 0) {
            return 1;
        }
        return factoriel(n - 1) * n;
    }

// O(log(n)): 
public static int binarySearch(int a[], int l, int h, int key) { 
    if (l == h) {
        if (key == a[l]) {
            return l;
        } else {
            return -1;
        }
    }
    
    int mid = (l + h)/2;
    
    if (key == a[mid]) {
        return mid;
    } else if (key > a[mid]) {
        return binarySearch(a, mid+1, h, key);
    } else {
        return binarySearch(a, l, mid-1, key);
    }
}
    

public static void main(String[] args) {
    System.out.println(factorielNR(4));	
    System.out.println(factoriel(4));	// Clearer Code (slightly slow)   		
    int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91}; 
    int index = binarySearch(a, 0, 8, 100);
    System.out.println("index: " + index);
}
}
