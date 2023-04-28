package testWork.methods;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }


    }
}




