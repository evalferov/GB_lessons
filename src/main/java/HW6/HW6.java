package HW6;
abstract class Animal {
    private final int maxBeg = 0;
    private final int maxPlav = 0;

    abstract void run(int length);
    abstract void swim(int length);

}

class Cat extends Animal {
    private final int maxBeg = 200;

       @Override
    void run(int length) {
        if ((length >= 0) && (length <= maxBeg)) System.out.println("Кот пробежал" + length + "м");
        else System.out.println("Кот не смог пробежать " + length + "м");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не плавает");
    }


}

class Dog extends Animal {
    private final int maxBeg = 500;
    private final int maxPlav = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= maxBeg)) System.out.println("Пёс пробежал " + length + "м");
        else System.out.println("Пёс не смог пробежать " + length + "м");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= maxPlav)) System.out.println("Пёс проплыл " + length + "м");
        else System.out.println("Пёс не смог проплыть " + length + "м");
    }


}
public class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(1);


        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

    }
}
