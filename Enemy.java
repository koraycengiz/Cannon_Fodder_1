public class Enemy extends Character{ // dallandır + item drop rate ayarla

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
    public int getVitality() {
        vitality = random.nextInt(5)+1;
        return vitality;
    }
    public int getIntelligence() {
        intelligence = random.nextInt(5)+1;
        return intelligence;
    }

}
