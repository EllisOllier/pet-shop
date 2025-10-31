public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Timmeh", 3, 249.99);
        System.out.println(cat1.makeNoise());
        System.out.println(cat1.stroke());

        Dog dog1 = new Dog("Zeus", 1, 1250);
        System.out.println(dog1.makeNoise());
        System.out.println(dog1.stroke());

        Goldfish fish1 = new Goldfish("Nemo", 12, 75);
        System.out.println(fish1.makeNoise());
    }
}
