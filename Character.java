import java.util.List;

public class Character {

    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(AttackStrategy attackStrategy,
                     List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}