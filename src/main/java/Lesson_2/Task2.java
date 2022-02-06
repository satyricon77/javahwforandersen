package Lesson_2;

public class Task2 {
    public static void main(String[] args) {
        Task2.typeNumber(0);
    }

    public static int typeNumber(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.");
        } else if (a < 0) {
            System.out.println("Число " + a + " отрицательное.");
        }
        return a;
    }
}
