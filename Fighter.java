public class Fighter extends Character {

    private int fighterHP;

    public int getFighterHP(){
        fighterHP = (2*strength)+(7*vitality)+intelligence;
        return fighterHP;
    }

    @Override
    public int getStrength() {
        strength = random.nextInt(5)+6;
        return strength;
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
