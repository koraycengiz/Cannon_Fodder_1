public class Enemy extends Character{

    private int enemyHP;

    public int getEnemyHP(){
        enemyHP = (2*strength)+(7*vitality)+intelligence;
        return enemyHP;
    }

    @Override
    public int getStrength() {
        strength = random.nextInt(5)+1;
        return strength;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(5)+1;
        return vitality;
    }

    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(5)+1;
        return intelligence;
    }
}
