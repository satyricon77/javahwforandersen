package Lesson_2;

public class Task3 {
    public static void main(String[] args) {
        Task3.typeNumber(0);
    }
    public static int typeNumber(int a) {
        if (a < 0) {
            System.out.println(true);
        } else if (a >= 0) {
            System.out.println(false);
        }
        return a;
    }
}
