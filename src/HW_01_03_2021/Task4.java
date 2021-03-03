package HW_01_03_2021;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 2; i < array.length; i+=3) {
            array[i] = 3;
        }
        System.out.println(Arrays.toString(array));
    }
}