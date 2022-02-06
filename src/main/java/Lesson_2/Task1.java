package Lesson_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1.inputValid(10, 10);
    }

    public static int inputValid(int a, int b) {
        int result = a + b;
        if (result >= 10 && result < 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return result;
    }
}
