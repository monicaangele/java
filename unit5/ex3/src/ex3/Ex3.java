package ex3;

public class Ex3 {

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

/**
 * The Pirate class is a generic pirate entity.
 * Properties:
 * - beardVolume: an integer representing the volume of the pirate's beard.
 * - missingLimbs: an integer representing the number of limbs the pirate is missing.
 */
class Pirate {
    public int beardVolume; 
    public int missingLimbs;
}

/**
 * The Ship class is a pirate ship entity.
 * Properties:
 * - cannonCount: an integer representing the number of cannons on the ship.
 * - crewSize: an integer representing the size of the ship's crew.
 */
class Ship {
    public int cannonCount;
    public int crewSize;
}

/**
 * The TreasureChest class is a treasure chest entity.
 * Properties:
 * - goldCoins: an integer representing the number of gold coins in the chest.
 * - rareJewels: an integer representing the number of rare jewels in the chest.
 */
class TreasureChest {
    public int goldCoins; 
    public int rareJewels; 
}
