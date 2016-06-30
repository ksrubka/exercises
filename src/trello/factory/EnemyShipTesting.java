package trello.factory;

/**
 * Created by Beata Iłowiecka on 29.06.16.
 */
class EnemyShipTesting {

    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}

abstract class EnemyShipBuilding {
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;
    }
}

class UFOEnemyShipBuilding extends EnemyShipBuilding {
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else
            if(typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");
            }
        return theEnemyShip;
    }
}

interface EnemyShipFactory{
    public ESWeapon addESGun();
    public ESEngine addESEngine();
}

class UFOEnemyShipFactory implements EnemyShipFactory{

    public ESWeapon addESGun() {
        return new ESUFOGun();
    }
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}

class UFOBossEnemyShipFactory implements EnemyShipFactory{
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}

abstract class EnemyShip {
    private String name;

    ESWeapon weapon;
    ESEngine engine;
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    abstract void makeShip();

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero at " + engine );
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String toString(){
        String infoOnShip = "The " + name + " has a top speed of " + engine +
                " and an attack power of " + weapon;
        return infoOnShip;
    }
}

class UFOEnemyShip extends EnemyShip{

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}

class UFOBossEnemyShip extends EnemyShip{

    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}

interface ESEngine{
    public String toString();
}

interface ESWeapon{
    public String toString();
}

class ESUFOGun implements ESWeapon{
    public String toString(){
        return "20 damage";
    }
}

class ESUFOEngine implements ESEngine{
    public String toString(){
        return "1000 mph";
    }
}

class ESUFOBossGun implements ESWeapon{
    public String toString(){
        return "40 damage";
    }
}

class ESUFOBossEngine implements ESEngine{
    public String toString(){
        return "2000 mph";
    }
}