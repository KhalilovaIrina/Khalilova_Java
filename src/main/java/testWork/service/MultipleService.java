package testWork.service;

import java.util.*;

public class MultipleService {
    public HashSet<Integer> multiple(int[] numbers, int multipleeNumber) {
        HashSet<Integer> multiple = new HashSet<>();

        for (int t : numbers) {
            if ((t % multipleeNumber) == 0) {
                multiple.add(t);
            }
        }
        return multiple;
    }
}
