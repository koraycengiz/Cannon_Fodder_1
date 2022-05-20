public class Test {
    public static void main(String[] args) {

        Character myCharacter = new Character();
        Fighter myFighter = new Fighter();
        Tank myTank = new Tank();
        Healer myHealer = new Healer();
        Enemy myEnemy = new Enemy();
        Item myItem = new Item();
        Sword mySword = new Sword();
        Shield myShield = new Shield();
        Wand myWand = new Wand();
        Armor myArmor = new Armor();

        int strength = myFighter.getStrength();
        int vitality = myTank.getVitality();
        int intelligence = myHealer.getIntelligence();
        //HESAPLADIĞI SAYIYLA BASTIRILAN SAYI FARKLI BURAYA TEKRAR BAK!!
        int damageofKatana = (mySword.valueofKatana*strength)/5;
        int damageofRoundShield = (myShield.valueofRoundShield*vitality)/3;
        int damageofGoldenWand = (myWand.valueofGoldenWand*intelligence)/4;

        System.out.println("Welcome to the game CANNON FODDER!");
        System.out.println("-----------------------------------------------------------------------------------------------");


        System.out.println("Fighter created with S:"+strength+" V:"+myFighter.getVitality()+" I:"+myFighter.getIntelligence()+".The HP is "+myFighter.getFighterHP()+".Fighter wields Katana with "+damageofKatana+" damages and "+mySword.weightofKatana+" units of weight.");
        System.out.println("Tank created with S:"+myTank.getStrength()+" V:"+vitality+" I:"+myTank.getIntelligence()+".The HP is "+myTank.getTankHP()+".Tank wields RoundShield with "+damageofRoundShield+" damages and "+myShield.weightofRoundShield+" unit of weight.");
        System.out.println("Healer created with S:"+myHealer.getStrength()+" V:"+myHealer.getVitality()+" I:"+intelligence+".The HP is "+myHealer.getHealerHP()+".Healer wields GoldenWand with "+damageofGoldenWand+" damages and "+myWand.weightofGoldenWand+" unit of weight.");
    }
}
