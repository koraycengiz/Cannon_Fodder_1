public class Enemy extends Character{

    private int enemyHP;
    private boolean isStunned;
    private String enemyName;

    public int getEnemyHP(){
        enemyHP = (2*strength)+(7*vitality)+intelligence;
        return enemyHP;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
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

    public void setStunStatus(){// will work on this later
        System.out.println("target successfully stunned");
        isStunned = true;
    }
    public void setAlive(boolean alive){
        this.isAlive = alive;
    }
}
