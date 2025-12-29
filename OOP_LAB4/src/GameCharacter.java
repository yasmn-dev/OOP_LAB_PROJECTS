import java.util.Random;

public class GameCharacter {
    private int characterId;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        Random rnd = new Random();
        this.characterId = 1000 + rnd.nextInt(9000); // [1000, 9999]
        totalCharacters++;
    }
    public int getCharacterId() {
        return characterId;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public static int getTotalCharacters() {
        return totalCharacters;
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    public void heal(int amount) {
        health += amount;
    }

    public String getInfo() {
        return "Character ID: " + characterId +
                "\nName: " + name +
                "\nLevel: " + level +
                "\nHealth: " + health;
    }
}