package HW_01_03_2021;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 2) {
                    array[i][j] = -1;
                }
                if (j == 1) {
                    array[i][j] = -1;
                }

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }
}