public class Shield extends Item{

    Tank aTank = new Tank();
    protected int myVitality = aTank.getVitality();

    protected final double weightofWoodenShield = 1;
    protected final double weightofRoundShield = 2;
    protected final double weightofKiteShield = 3;

    protected final int valueofWoodenShield = 2;
    protected final int valueofRoundShield = 3;
    protected final int valueofKiteShield = 5;

    public int calculateDamageofWoodenShield(){
        int damage = (valueofWoodenShield*myVitality)/3;
        return damage;
    }

    public int calculateDamageofRoundShield(){
        int damage = (valueofRoundShield*myVitality)/3;
        return damage;
    }

    public int calculateDamageofKiteShield(){
        int damage = (valueofKiteShield*myVitality)/3;
        return damage;
    }

    //Stun is the number of enemies to stun!
    public int stunofWoodenShield(){
        int stun = (valueofWoodenShield*myVitality);
        return stun;
    }

    public int stunofRoundShield(){
        int stun = (valueofRoundShield*myVitality);
        return stun;
    }

    public int stunofKiteShield(){
        int stun = (valueofKiteShield*myVitality);
        return stun;
    }
}