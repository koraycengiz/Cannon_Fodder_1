public class Sword extends Item{
    Fighter aFighter = new Fighter();

    protected int myStrength = aFighter.getStrength();

    protected final double weightofShortBlade = 1;
    protected final double weightofKatana = 2;
    protected double weightofExcalibur = 3;

    protected int valueofShortBlade = 5;
    protected int valueofKatana = 8;
    protected final int valueofExcalibur = 10;



    public int calculateDamageofShortBlade(){
        int damage = (valueofShortBlade*myStrength)/5;
        return damage;
    }
    public int calculateDamageofKatana(){
        int damage = (valueofKatana*myStrength)/5;
        return damage;
    }
    public int calculateDamageofExcalibur(){
        int damage = (valueofExcalibur*myStrength)/5;
        return damage;
    }

    //Inactivity is the number of enemies to keep away from fighter!
    public int inactivityofShortBlade(){
        int inactivity = (valueofShortBlade*myStrength);
        return inactivity;
    }

    public int inactivityofKatana(){
        int inactivity = (valueofKatana*myStrength);
        return inactivity;
    }

    public int inactivityofExcalibur(){
        int inactivity = (valueofExcalibur*myStrength);
        return inactivity;
    }

}
