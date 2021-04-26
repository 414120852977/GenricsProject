package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class Maximum {
    @Test
    public static <T extends  Comparable<T>> T findMaximumNum(T a ,  T b, T c) {
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0) {
            max = c;
        }
        printMax(a,b,c,max);
        return max;
    }

    private static <T extends  Comparable<T>> void printMax(T a, T b, T c, T max) {
        System.out.println("max value is :"+max);
    }

    public static void main(String[] args) {
        FindMaximum maximum = new FindMaximum();
        findMaximumNum(25,8,11);
    }
}

