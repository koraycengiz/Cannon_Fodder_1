public class Fighter extends Character {

    private int fighterHP;

    public int getFighterHP(){
        fighterHP = (2*strength)+(7*vitality)+intelligence;
        return fighterHP;
    }

    @Override
    public int getStrength() {
        strength = random.nextInt(5)+6;
        return strength;
    }
}
