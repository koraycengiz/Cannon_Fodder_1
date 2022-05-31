import java.util.Scanner;

public class Inventory extends Item{// if we take the inventory methods from character to this class, it would look better
    //we'll make "character has a inventory" type of relationship between classes
    protected Item[] inventory = new Item[20];
    protected Item selectedItem;
    protected int selectedItemNo; //made this just erase an item from the inventory
    public void calculateInventorySpace(){// this requires more thinking
        double sum = 0;
        for(int i = 0; i<=inventory.length;i++){
            sum += inventory[i].getWeight();
        }
        // had to make this dissappear because strenght isn't an attribute to item, probably its best to leave it in character

       // if(strength>=sum){}
       // else{
        //    System.out.println("you are not strong enough to carry that much");
        // }
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

}
