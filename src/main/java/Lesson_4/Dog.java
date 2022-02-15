package Lesson_4;

public class Dog extends Animal{
    int runMax = 500;
    int swimMax = 10;
    static int dogCount;
    public Dog (String name, String color){
        super (name, color);
        dogCount++;
    }
    @Override
    public int doRun(int length) {
        if (length <= runMax){
            System.out.println(name + " пробежал " + length + " метра");
        }
        else {
            System.out.println(name + " Не может столько пробежать!");
        }
        return length;
    }

    @Override
    public int doSwim(int length) {
        if (length <= swimMax){
            System.out.println(name + " проплыл " + length);
        }
        else {
            System.out.println(name + " не может столько проплыть.");
        }
        return length;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Ronya", "Black");
        dog1.doRun(454);
        System.out.println(dogCount);
    }
}
