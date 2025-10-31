public class Cat extends Pet {
    public Cat(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    public String makeNoise(){
        return super.getName() + " MEOWWWSSS!";
    }
}
