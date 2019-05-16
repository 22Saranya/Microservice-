package com.stackroute.Pe3;
import java.util.*;
    public class ChessBoard {
        public static void main(String[] args) {

            int rows=8, cols=8;
            System.out.println("My Chess Board");
            String output[][] = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW";
                        System.out.print(output[i][j] + "|");
                    } else {
                        output[i][j] = "BB";
                        System.out.print(output[i][j] + "|");
                    }
                }
                System.out.println();
            }
        }
    }





