import java.util.ArrayList;

public class PetShop {
    private Pet[] pets = new Pet[10];

    public PetShop(){
        pets[0] = new Cat("Johnathon", 11, 300);
        pets[1] = new Cat("Jake", 5, 300);
        pets[2] = new Cat("Riggs", 12, 300);
        pets[3] = new Dog("Ralph", 16, 1300);
        pets[4] = new Dog("Bruce", 13, 930);
        pets[5] = new Dog("Scott", 4, 760);
        pets[6] = new Dog("Zeus", 1, 1250);
        pets[7] = new Dog("Barry", 7, 475);
        pets[8] = new Goldfish("Blubber", 2, 30);
        pets[9] = new Goldfish("Flubber", 4, 20);
    }

    public void buyDog(){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] instanceof Dog){
                System.out.println("You have bought " + pets[i].getName() + " they are " + pets[i].getAge() + " year(s) old!");
                pets[i] = null;
                break;
            }
        }
    }

    public void buyCat(){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] instanceof Cat){
                System.out.println("You have bought " + pets[i].getName() + " they are " + pets[i].getAge() + " year(s) old!");
                pets[i] = null;
                break;
            }
        }
    }

    public void buyGoldfish(){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] instanceof Goldfish){
                System.out.println("You have bought " + pets[i].getName() + " they are " + pets[i].getAge() + " year(s) old!");
                pets[i] = null;
                break;
            }
        }
    }
}
