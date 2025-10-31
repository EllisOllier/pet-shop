public class Dog extends Pet {
    public Dog(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    public String makeNoise(){
        return super.getName() + " WOOF WOOF!";
    }
}
