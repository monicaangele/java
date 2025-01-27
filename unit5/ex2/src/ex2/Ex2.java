package ex2;

public class Ex2 {

	public static void main(String[] args) {
		Pirate firstPirate = new Pirate();
        firstPirate.beardVolume = 5;
        firstPirate.missingLimbs = 2;

        Pirate secondPirate = new Pirate();
        secondPirate.beardVolume = 10;
        secondPirate.missingLimbs = 1;

        Ship firstShip = new Ship();
        firstShip.cannonCount = 15;
        firstShip.crewSize = 50;

        Ship secondShip = new Ship();
        secondShip.cannonCount = 8;
        secondShip.crewSize = 30;

        TreasureChest firstChest = new TreasureChest();
        firstChest.goldCoins = 100;
        firstChest.rareJewels = 20;

        TreasureChest secondChest = new TreasureChest();
        secondChest.goldCoins = 200;
        secondChest.rareJewels = 50;

        System.out.println("First Pirate: Beard Volume = " + firstPirate.beardVolume + ", Missing Limbs = " + firstPirate.missingLimbs);
        System.out.println("Second Pirate: Beard Volume = " + secondPirate.beardVolume + ", Missing Limbs = " + secondPirate.missingLimbs);

        System.out.println("First Ship: Cannon Count = " + firstShip.cannonCount + ", Crew Size = " + firstShip.crewSize);
        System.out.println("Second Ship: Cannon Count = " + secondShip.cannonCount + ", Crew Size = " + secondShip.crewSize);

        System.out.println("First Treasure Chest: Gold Coins = " + firstChest.goldCoins + ", Rare Jewels = " + firstChest.rareJewels);
        System.out.println("Second Treasure Chest: Gold Coins = " + secondChest.goldCoins + ", Rare Jewels = " + secondChest.rareJewels);
    }
}

class Pirate {
    public int beardVolume;
    public int missingLimbs;
}

class Ship {
    public int cannonCount;
    public int crewSize;
}

class TreasureChest {
    public int goldCoins;
    public int rareJewels;
}
