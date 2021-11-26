package lesson7;

public class Tiger {
    String name;
    int distance;

    public Tiger(String name) {
        this.name = name;
    }

    public void run(int run) {
        distance = 700;
        if (distance >= run & run > 0) {
            System.out.println(name + " пробежал: " + run);
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    public void swin(int swim) {
        distance = 9;
        if (distance >= swim & swim > 0) {
            System.out.println(name + " проплыл: " + swim);
        } else {
            System.out.println(name + " не может столько проплыть");
        }
    }

    public void jump(float jump) {
        distance = 10;
        if (distance >= jump & jump > 0) {
            System.out.println(name + " прыгнул: " + jump);
        } else {
            System.out.println(name + " не прыгает так высоко");
        }
    }
}
