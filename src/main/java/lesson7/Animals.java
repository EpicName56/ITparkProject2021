package lesson7;

public class Animals {

    public static void main(String[] args) {
        Cat cat = new Cat("Cake");
        cat.run(150);
        cat.swim(0);
        cat.jump(1);

        System.out.println("-----------------------------");

        Dog dog = new Dog("Bobik");
        dog.run(200);
        dog.swim(2);
        dog.jump(3);

        System.out.println("-----------------------------");

        Tiger tiger = new Tiger("Sharik");
        tiger.run(700);
        tiger.swin(7);
        tiger.jump(6);
    }
}
