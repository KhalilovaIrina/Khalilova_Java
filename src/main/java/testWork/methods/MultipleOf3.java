package testWork.methods;

import testWork.data.DataHelper;
import testWork.service.MultipleService;

import java.util.HashSet;

public class MultipleOf3 {
    public static void main(String[] args) {
        DataHelper data = new DataHelper();
        int[] numbers = data.array();
        MultipleService service = new MultipleService();
        HashSet<Integer> multipleeOfTree = service.multiple(numbers, 3);
        System.out.println(multipleeOfTree);
    }
}

