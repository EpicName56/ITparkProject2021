package lesson7;

public class Cat {
    String name;
    int distance;

    public Cat(String name) {
        this.name = name;
    }

    public void run(int run) {
        distance = 200;
        if (distance >= run & run > 0) {
            System.out.println(name + " пробежал: " + run);
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swim(int swim) {
        System.out.println(name + " пошел ко дну :(");
    }

    public void jump(float jump) {
        distance = 2;
        if (distance >= jump & jump > 0) {
            System.out.println(name + " прыгнул на: " + jump);
        } else {
            System.out.println(name + " не прыгает так высоко");
        }
    }
}
