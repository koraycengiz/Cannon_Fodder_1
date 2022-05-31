public class Wand extends Item{

    Healer aHealer = new Healer();

    protected int myIntelligence =  aHealer.getIntelligence();

    protected final double weightofWoodenWand = 0.1;
    protected final double weightofGoldenWand = 0.2;
    protected final double weightofCaduceus = 0.3;

    protected final int valueofWoodenWand = 2;
    protected final int valueofGoldenWand = 3;
    protected final int valueofCaduceus = 5;

    public int calculateDamageofWoodenWand(){
        int damage = (valueofWoodenWand*myIntelligence)/4;
        return damage;
    }

    public int calculateDamageofGoldenWand(){
        int damage = (valueofGoldenWand*myIntelligence)/4;
        return damage;
    }

    public int calculateDamageofCaduceus(){
        int damage = (valueofCaduceus*myIntelligence)/4;
        return damage;
    }

    public int healofWoodenWand(){
        int heal = (valueofWoodenWand*myIntelligence);
        return heal;
    }

    public int healofGoldenWand(){
        int heal = (valueofGoldenWand*myIntelligence);
        return heal;
    }

    public int healofCaduceus(){
        int heal = (valueofCaduceus*myIntelligence);
        return heal;
    }
}