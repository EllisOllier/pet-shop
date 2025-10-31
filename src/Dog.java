public class Dog extends Pet implements Strokeable {
    public Dog(String name, int age, double cost){
        super.setName(name);
        super.setAge(age);
        super.setCost(cost);
    }

    public String makeNoise(){
        return super.getName() + " WOOF WOOF!";
    }

    public String stroke(){
        super.makeNoise();
        return super.getName() + " enjoys being stroked!";
    }
}
