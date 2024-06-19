public class Pikachu extends Pokemon{


    public Pikachu(String name, String type, int level, int hp, int attack, int spAttack, int defence, int spDefence) {
        super(name, type, level, hp, attack, spAttack, defence, spDefence);
    }

    public boolean isDefeated() {
        return getHp() <= 0;
    }

    public void voltTackle(Pokemon enemy){
        int power = 120;
        int damage = ((((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2) * 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Pikachu uses Volt Tackle!");
        System.out.println("Electricity Sparks as Pikachu speeds up to slam his target!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void ironTail(Pokemon enemy){
        int power = 100;
        int damage = (((2*level)/5 + 2) * power * attack/enemy.getDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Pikachu uses Iron Tail!");
        System.out.println("Pikachu Steels his tail, jumps, spins and smacks his target with his tail!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void thunder(Pokemon enemy){
        int power = 110;
        int damage = ((((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2) * 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Pikachu uses Thunder!");
        System.out.println("Pikachu Charges a large amount to strike his target!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void quickAttack(Pokemon enemy){
        int power = 40;
        int damage = (((2*level)/5 + 2) * power * attack/enemy.getDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Pikachu uses Quick Attack!");
        System.out.println("Pikachu disappears and he smacks his target at lightning speed!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }
    public void sound(){
        System.out.println("PikaPika!");
    }
}
