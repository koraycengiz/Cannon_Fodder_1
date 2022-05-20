import java.util.*;
import java.security.SecureRandom;

public class Character {

    protected int strength;
    protected int vitality;
    protected int intelligence;

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

    public Character(){}

    public Character(int s,int v,int i){
        this.strength = s;
        this.vitality = v;
        this.intelligence = i;
    }


}
