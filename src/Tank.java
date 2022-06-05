import java.util.ArrayList;

public class Tank extends Character{

    private int tankHP;

    public int getTankHP(){
        tankHP = (2*strength)+(7*vitality)+intelligence;
        return tankHP;
    }

    public void setTankHP(int tankHP) {
        this.tankHP = tankHP;
    }


    @Override
    public int getVitality() {
        vitality = random.nextInt(5)+6;
        return vitality;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    //start of inventory related codes

}
