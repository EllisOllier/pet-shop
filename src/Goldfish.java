public class Goldfish extends Pet {
    public Goldfish(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    public String makeNoise(){
        return super.getName() + " Bloop Bloop!";
    }
}
