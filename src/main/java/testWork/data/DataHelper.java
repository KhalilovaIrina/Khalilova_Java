package testWork.data;

import java.util.Random;

public class DataHelper {
    public int[] array() {
        Random r = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        return array;
    }

}

