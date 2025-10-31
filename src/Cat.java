public class Cat extends Pet implements Strokeable {
    public Cat(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    public String makeNoise(){
        return super.getName() + " MEOWWWSSS!";
    }

    public String stroke(){
        return super.getName() + " wanders off and ignores you!";
    }
}
