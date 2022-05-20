public class Healer extends Character{

    private int healerHP;

    public int getHealerHP(){
        healerHP = (2*strength)+(7*vitality)+intelligence;
        return healerHP;
    }

    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(5)+6;
        return intelligence;
    }
}
