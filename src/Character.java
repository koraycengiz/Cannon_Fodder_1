import java.security.SecureRandom;
import java.util.Scanner;

public abstract class Character {

    protected int strength;
    protected int vitality;
    protected int intelligence;

    protected Item[] inventory = new Item[20];
    protected Item selectedItem;
    protected int selectedItemNo; //made this just erase an item from the inventory
    protected Item activeWeapon; //declaring them like this is going to be a problem later on
    protected Armor activeArmor; // this too


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

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


                                //item related methodes starts here
    public void calculateInventorySpace(){// this requires more thinking
        double sum = 0;
       for(int i = 0; i<=inventory.length;i++){
           sum += inventory[i].getWeight();
       }
       if(strength>=sum){}
       else{
           System.out.println("you are not strong enough to carry that much");
       }
    }
    public void pickItem(){}//requires enemy item drop

    public void displayInventory(){
        for(int i=0 ;i<=inventory.length;i++){
          String tempName =  inventory[i].getName();
            System.out.println((i+1)+"-"+tempName);
        }
    }

    public void selectItem(){ //favori methodum :D
        Scanner sc = new Scanner(System.in);
        System.out.println("please select an item according to its inventory position(1-20)");
        selectedItemNo = sc.nextInt()-1;
        this.selectedItem = inventory[selectedItemNo];
    }
    public void discardItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("discarded items are forever lost do you really wish to discard "+ selectedItem.getName()+" ?[y][n]");
        String tempchoice = sc.nextLine();
        if (tempchoice == "y"){
            inventory[selectedItemNo] = null;
            System.out.println("item succesfully discarded");
        }
        else if (tempchoice == "n"){}// don't know what to write here
    }

    public void equipItem(){
        String tempType = selectedItem.getClass().toString();
        if(tempType == "Armor"){
            System.out.println("wearing "+selectedItem.getName()+" now");// same thing as weapons
            selectedItem = activeArmor ; // this feels wrong probably gives null value
        }
        else if(tempType == "Sword"){
            activeWeapon = selectedItem; // can't make weaponType = item
            System.out.println("wielding "+selectedItem.getName()+" now");// can we can make(?): characters stats= characters stats+items values
        }
        else if(tempType == "Shield"){
            activeWeapon = selectedItem;
            System.out.println("wielding "+selectedItem.getName()+" now");
        }
        else if(tempType == "Wand"){
            activeWeapon = selectedItem;
            System.out.println("wielding "+selectedItem.getName()+" now");
        }
    }
    public void examineItem(){ //can't get spesifics unless we know which subclass the item is
        System.out.println("selected items attributes: ");
        System.out.println("Name: "+selectedItem.getName());
        System.out.println("Weight: "+selectedItem.getWeight());
        System.out.println("Sell value: "+selectedItem.getValue());
    }
                            //item related methodes ends here

    public Character(){}

    public Character(int s,int v,int i){
        this.strength = s;
        this.vitality = v;
        this.intelligence = i;
    }


}
