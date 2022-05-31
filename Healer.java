public class Healer extends Character{

    private int healerHP;

    public int getHealerHP(){
        healerHP = (2*strength)+(7*vitality)+intelligence;
        return healerHP;
    }

    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(5)+6;
        return intelligence;
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
    public void examineItem(){
        super.examineItem();
    }
    public void equipItem(){
        super.equipItem();
    }
    public void discardItem(){
        super.discardItem();
    }
}
