package HW_01_03_2021;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            array[5]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}