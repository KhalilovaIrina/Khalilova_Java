package testWork.methods;
import testWork.data.DataHelper;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        DataHelper data = new DataHelper();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number > data.validNumber()) {
            System.out.println("Привет");
        }


    }
}




