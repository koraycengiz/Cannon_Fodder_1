public class Tank extends Character{


    public int getTankHP(){
        int tankHP = (2*strength)+(7*vitality)+intelligence;
        return tankHP;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(5)+6;
        return vitality;
    }
}
