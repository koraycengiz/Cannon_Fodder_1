import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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


        boolean offSwitch=true;

        while (offSwitch){
            System.out.println("""
                    Welcome to the game CANNON FODDER!
                    -----------------------------------------------------------------------------------------------
                    Press 1 to start the game
                    Press 2 to view high scores
                    Press 3 to terminate the game"""
            );
            int usersMenuChoice = input.nextInt();
            switch (usersMenuChoice){
                case 1:
                    System.out.println("Fighter created with S:"+mySword.myStrength+" V:"+myFighter.getVitality()+" I:"+myFighter.getIntelligence()+".The HP is "+myFighter.getFighterHP()+".Fighter wields Katana with "+mySword.calculateDamageofKatana()+" damages and "+mySword.weightofKatana+" units of weight.");
                    System.out.println("Tank created with S:"+myTank.getStrength()+" V:"+myShield.myVitality+" I:"+myTank.getIntelligence()+".The HP is "+myTank.getTankHP()+".Tank wields RoundShield with "+myShield.calculateDamageofRoundShield()+" damages and "+myShield.weightofRoundShield+" unit of weight.");
                    System.out.println("Healer created with S:"+myHealer.getStrength()+" V:"+myHealer.getVitality()+" I:"+myWand.myIntelligence+".The HP is "+myHealer.getHealerHP()+".Healer wields GoldenWand with "+myWand.calculateDamageofGoldenWand()+" damages and "+myWand.weightofGoldenWand+" unit of weight.");
                    break;
                case 2:
                    break;
                case 3:
                    offSwitch = false;
                    break;
            }
        }

    }
}
