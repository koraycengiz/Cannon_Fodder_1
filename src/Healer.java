import java.util.ArrayList;

public class Healer extends Character{

    private int healerHP;


    public int getHealerHP(){
        healerHP = (2*strength)+(7*vitality)+intelligence;
        return healerHP;
    }
    public void setHealerHP(int healerHP) {
        this.healerHP = healerHP;
    }


    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(5)+6;
        return intelligence;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    //start of inventory related codes

}
