public class Tank extends Character{

    private int tankHP;

    public int getTankHP(){
        tankHP = (2*strength)+(7*vitality)+intelligence;
        return tankHP;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(5)+6;
        return vitality;
    }
}
