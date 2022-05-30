public class Tank extends Character{

    private int tankHP;

    public int getTankHP(){
        tankHP = (2*strength)+(7*vitality)+intelligence;
        return tankHP;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(5)+6;
        return vitality;
    }

    //start of inventory related codes
    public void calculateInventorySpace(){
        super.calculateInventorySpace();
    }
    public void displayInventory(){
        super.displayInventory();
    }
    public void pickItem(){
        super.pickItem();
    }
    public void selectItem(){
        super.selectItem();
    }
    public void equipItem(){
        super.equipItem();
    }
    public void examineItem(){
        super.examineItem();
    }
    public void discardItem(){
        super.discardItem();
    }
}
