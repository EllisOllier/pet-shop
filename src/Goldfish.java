public class Goldfish extends Pet {
    public Goldfish(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    @Override
    public String makeNoise(){
        return super.makeNoise() + " They're a goldfish!";
    }
}
