public class Character {
    String name = "Thor";
    int health = 10;
    int maxHealth = 100;
    int level = 1;
    int xp = 0;
    double gold = 0.0;
    boolean isAlive = true;
    String role = "Warrior";

    Inventory inventory = new Inventory();
    public void printStats() {
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + name);
        System.out.println("Health points: " + health);
        System.out.println("Max health: " + maxHealth);
        System.out.println("Level: " + level);
        System.out.println("Experiance points: " + xp);
        System.out.println("Gold: " + gold);
        System.out.println("Is alive: " + isAlive);
        System.out.println("Type: " + role);
        System.out.println();
        System.out.println("Inventory (" + Inventory.inventory.length + " itmes)");
        System.out.println(" - " + Inventory.inventory[0]);
        System.out.println(" - " + Inventory.inventory[1]);
        System.out.println(" - " + Inventory.inventory[2]);
    }

    public boolean healthCheck() {
        if (health < 25) {
            System.out.println("WARNING: Health critical");
        }
        if (health>0 ){
            isAlive = false;
        }

    return true;}





}




