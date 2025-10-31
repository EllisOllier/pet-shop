abstract public class Pet {
    private String name;
    private int age;
    private double cost;

    // Gets
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getCost(){
        return this.cost;
    }

    // Sets
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setCost(double newCost){
        this.cost = newCost;
    }

    // Methods
    public String makeNoise(){
        return this.name + " does not make a noise!";
    }
}
