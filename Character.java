import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Character {

    protected int strength;
    protected int vitality;
    protected int intelligence;

    protected ArrayList<Item> inventory = new ArrayList<Item>();
    protected Item selectedItem;
    protected int selectedItemNo; //made this just erase an item from the inventory
    protected Item armor = new Armor(); //this is apperently a form of upcasting it shouldn't give errors also its a form of polymorphism

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
    public void calculateInventorySpace(){// this requires more thinking
        double sum = 0;
        for(int i = 0; i<=20;i++){

        }
        // had to make this dissappear because strenght isn't an attribute to item, probably its best to leave it in character

         if(strength>=sum){}
         else{
            System.out.println("you are not strong enough to carry that much");
         }
    }
    public void pickItem(){}//requires enemy item drop

    public void displayInventory(){
        for(int i=0 ;i <=inventory.size();i++){
            System.out.println((i+1)+"-" + inventory.get(i));
        }
    }

    public void selectItem(){ //favori methodum :D
        Scanner sc = new Scanner(System.in);
        System.out.println("please select an item according to its inventory position(1-20)");
        selectedItemNo = sc.nextInt()-1;
        this.selectedItem = inventory.get(selectedItemNo);
    }
    public void discardItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("discarded items are forever lost do you really wish to discard "+ selectedItem.getName()+" ?[y][n]");
        String tempchoice = sc.nextLine();
        if (tempchoice == "y"){
           inventory.remove(selectedItemNo);
            System.out.println("item succesfully discarded");
        }
        else if (tempchoice == "n"){}// don't know what to write here
    }

    public void equipItem(){//we can make item type based skills work by just saying it is a sword/shield/wand
        String tempType = selectedItem.getClass().toString();
        if(tempType == "Armor"){
            System.out.println("wearing "+selectedItem.getName()+" now");// same thing as weapons
            //  armor = selectedItem; //will specify what type of armor later on
        }
        else if(tempType == "Sword"){
            System.out.println("wielding "+selectedItem.getName()+" now");// can we can make(?): characters stats= characters stats+items values
        }
        else if(tempType == "Shield"){
            System.out.println("wielding "+selectedItem.getName()+" now");
        }
        else if(tempType == "Wand"){
            System.out.println("wielding "+selectedItem.getName()+" now");
        }
    }
    public void examineItem(){ //can't get specifics unless we know which subclass the item is
        System.out.println("selected items attributes: "); // we can make this as a method of item so other specific items can override this method
        System.out.println("Name: "+selectedItem.getName());
        System.out.println("Weight: "+selectedItem.getWeight());
        System.out.println("Sell value: "+selectedItem.getValue());
    }



    public Character(){}

    public Character(int s,int v,int i){
        this.strength = s;
        this.vitality = v;
        this.intelligence = i;
    }


}
