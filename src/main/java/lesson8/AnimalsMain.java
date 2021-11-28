package lesson8;

public class AnimalsMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cake");
        animals[1] = new Cow("Burenka");
        animals[2] = new Dog("Sharik");
        animals[3] = new Parrot("Kesha");

        for (Animal m : animals) {
            m.voice();
        }
    }
}
