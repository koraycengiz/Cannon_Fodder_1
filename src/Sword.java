public class Sword extends Item{
    Fighter aFighter = new Fighter();

    final double weightofShortBlade = 1;
    final double weightofKatana = 2;
    final double weightofExcalibur = 3;

    final int valueofShortBlade = 5;
    final int valueofKatana = 8;
    final int valueofExcalibur = 10;



    public int calculateDamageofShortBlade(){
        int damage = valueofShortBlade * aFighter.getStrength();
        return damage;
    }
    public int calculateDamageofKatana(){
        int damage = valueofKatana * aFighter.strength;
        return damage;
    }
    public int calculateDamageofExcalibur(){
        int damage = valueofExcalibur * aFighter.strength;
        return damage;
    }

}
