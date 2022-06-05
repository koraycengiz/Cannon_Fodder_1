import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Character {

    protected int strength;
    protected int vitality;
    protected int intelligence;
    protected ArrayList<Item> inventory = new ArrayList<>();
    protected Item selectedItem;
    protected int selectedItemNo; //made this just erase an item from the inventory
    protected Item activeWeapon; //declaring them like this is going to be a problem later on
    protected Armor activeArmor; // this too
    protected boolean isAlive=true;




    SecureRandom random = new SecureRandom();


    public int getStrength() {
        strength = random.nextInt(10)+1;
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        vitality = random.nextInt(10)+1;
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        intelligence = random.nextInt(10)+1;
        return intelligence;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Item getActiveWeapon() {
        return activeWeapon;
    }

    public void setActiveWeapon(Item activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public Armor getActiveArmor() {
        return activeArmor;
    }

    public void setActiveArmor(Armor activeArmor) {
        this.activeArmor = activeArmor;
    }




    //item related methodes starts here
    public void calculateInventorySpace(){// this requires more thinking
        double sum = 0;
       for(int i = 0; i<=inventory.size();i++){
           sum += inventory.get(i).getWeight();
       }
       if(strength>=sum){}
       else{
           System.out.println("you are not strong enough to carry that much");
       }
    }
    public void pickItem(){}//requires enemy item drop

    public void displayInventory(){
        for(int i=0 ;i<inventory.size();i++){
          String tempName =  inventory.get(i).getName();
            System.out.println((i+1)+"-"+tempName);
        }
    }

    public void selectItem(){ //favori methodum :D
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an item according to its inventory position");
        selectedItemNo = sc.nextInt()-1;
        this.selectedItem = inventory.get(selectedItemNo);
    }
    public void discardItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("discarded items are forever lost do you really wish to discard "+ selectedItem.getName()+" ?[y][n]");
        String tempchoice = sc.nextLine();
        if (Objects.equals(tempchoice, "y")){
            inventory.remove(selectedItemNo);
            System.out.println("item successfully discarded");
        }
        else if (Objects.equals(tempchoice, "n")){}// don't know what to write here
    }

    public void equipItem(Character character){
        String tempType = selectedItem.getClass().toString();
        if(tempType=="Armor"){
            character.setActiveArmor((Armor) selectedItem);

        }else{
            character.setActiveWeapon(selectedItem);
        }
    }
    public void examineItem(){ //can't get spesifics unless we know which subclass the item is
        System.out.println("selected items attributes: ");
        System.out.println("Name: "+selectedItem.getName());
        System.out.println("Weight: "+selectedItem.getWeight());
        System.out.println("Sell value: "+selectedItem.getValue());
    }
                            //item related methodes ends here

    public  void characterMenu() {
        System.out.println("""
                Please choose the action
                ----------------------------------
                Press 1 to Normal attack
                Press 2 to Special attack
                Press 3 to See your inventory
                Press 4 to equip item in your inventory
                Press 5 to discard item in your inventory"""
        );
    }


    public Character(){}

    public Character(int s,int v,int i, boolean isAlive){
        this.strength = s;
        this.vitality = v;
        this.intelligence = i;
        this.isAlive = isAlive;
    }


}
