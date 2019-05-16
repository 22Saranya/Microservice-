package com.stackroute.Pe3;
import java.util.Scanner;
public class AddTwoMatrix {
    public static void main(String args[])
    {
        int rowinput, columninput, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        rowinput = in.nextInt();
        System.out.println("Input number of columns of matrix");
        columninput  = in.nextInt();

        int firstmatrix[][] = new int[rowinput][columninput];
        int secondmatrix[][] = new int[rowinput][columninput];
        int sum[][] = new int[rowinput][columninput];

        System.out.println("Input elements of first matrix");

        for (c = 0; c < rowinput; c++)
            for (d = 0; d < columninput; d++)
                firstmatrix[c][d] = in.nextInt();

        System.out.println("Input elements of second matrix");

        for (c = 0 ; c < rowinput ; c++)
            for (d = 0 ; d < columninput ; d++)
                secondmatrix[c][d] = in.nextInt();

        for (c = 0; c < rowinput; c++)
            for (d = 0; d < columninput; d++)
                sum[c][d] = firstmatrix[c][d] + secondmatrix[c][d];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (c = 0; c < rowinput; c++)
        {
            for (d = 0; d < columninput; d++)
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}

