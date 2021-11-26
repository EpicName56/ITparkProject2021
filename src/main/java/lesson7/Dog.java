package lesson7;

public class Dog {
    String name;
    int distance;

    public Dog(String name) {
        this.name = name;
    }

    public void run(int run) {
        distance = 500;
        if (distance >= run & run > 0) {
            System.out.println(name + " пробежал: " + run);
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swim(int swim) {
        distance = 3;
        if (distance >= swim & swim > 0) {
            System.out.println(name + " проплыл: " + swim);
        } else {
            System.out.println(name + " не может столько проплыть");
        }
    }

    public void jump(float jump) {
        distance = 1;
        if (distance >= jump & jump > 0) {
            System.out.println(name + " прыгнул на: " + jump);
        } else {
            System.out.println(name + " не прыгает так высоко");
        }
    }
}
