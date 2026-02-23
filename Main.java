import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Knight
        Character knight = new Character(
                new SwingSword(),
                List.of(
                        new Shield(),
                        new Dodge(),
                        new CreateMagic()
                )
        );

        // Wizard
        Character wizard = new Character(
                new CastSpell(),
                List.of(
                        new CreateMagic()
                )
        );

        // Archer
        Character archer = new Character(
                new ShootArrow(),
                List.of(
                        new Dodge()
                )
        );

        System.out.println("=== Knight ===");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\n=== Wizard ===");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\n=== Archer ===");
        archer.performAttack();
        archer.performDefense();
    }
}