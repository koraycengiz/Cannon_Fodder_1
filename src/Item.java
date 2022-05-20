public class Item {

    protected String name;
    protected double weight;
    protected int value;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item(){}

    public Item(String name,double weight,int value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
}
