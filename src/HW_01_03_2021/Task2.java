package HW_01_03_2021;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("СЂР°РЅРґРѕРјРЅС‹Р№ РјР°СЃСЃРёРІ РёР· 10 С‡РёСЃРµР»");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("РџРµСЂРІР°СЏ РїРѕР»РѕРІРёРЅР° РїРѕ СѓР±С‹РІР°РЅРёСЋ");
        for (int i = 0; i < (array.length / 2) - 1; i++) {
            for (int j = 0; j < (array.length / 2) - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
                if (array[i] < array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }

            }

            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println("Р’С‚РѕСЂР°СЏ РїРѕР»РѕРІРёРЅР° РїРѕ РІРѕР·СЂР°СЃС‚Р°РЅРёСЋ");
        for (int i = 5; i < array.length - 1; i++) {
            for (int j = 5; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
                if (array[i] > array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }

            }
            System.out.println(Arrays.toString(array));
        }


    }
}