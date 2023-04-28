package testWork.methods;

import testWork.data.DataHelper;

import java.util.Scanner;

public class HelloVyacheslav {
    public static void main(String[] args) {
        DataHelper data = new DataHelper();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        if (name.equals(data.validName())) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
