public class TestGameCharacter {
    public static void main(String[] args) {

        GameCharacter c1 = new GameCharacter("Warrior", 1, 100);
        c1.takeDamage(30);
        c1.heal(10);

        System.out.println("CHARACTER 1: ");
        System.out.println(c1.getInfo());

        GameCharacter c2 = new GameCharacter("Mage", 3, 80);

        System.out.println("\nGAME INFO: ");
        System.out.println("Total Characters in Game: " + GameCharacter.getTotalCharacters());
    }
}

