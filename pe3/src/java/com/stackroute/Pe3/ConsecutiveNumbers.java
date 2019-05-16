package com.stackroute.Pe3;

import java.util.Scanner;
import java.lang.*;

public class ConsecutiveNumbers {
    public static void main(String args[]) {
        String s="";

        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);

        s=scanner.next();

        String[] array=s.split(",");
        int[] arr=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i]=Integer.parseInt(array[i]);
        }
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == 1 || (arr[i + 1] - arr[i]) == -1) {
            } else {
                result = false;
                break;
            }
        }
        if(result)
            System.out.println("Output:" + s + " " + "are consecutive numbers");
        else
            System.out.println("Output:" + s + " " + "are non consecutive numbers");
    }
}


