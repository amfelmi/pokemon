public class Gengar extends Pokemon{

    public Gengar(String name, String type, int level, int hp, int attack, int spAttack, int defence, int spDefence) {
        super(name, type, level, hp, attack, spAttack, defence, spDefence);
    }

    public boolean isDefeated() {
        return hp <= 0;
    }

    public void shadowBall(Pokemon enemy) {
        int power = 80;
        int damage = (((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Gengar uses Shadow Ball!");
        System.out.println("A ball of dark energy is hurled at the target!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void sludgeBomb(Pokemon enemy) {
        int power = 90;
        int damage = (((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Gengar uses Sludge Bomb!");
        System.out.println("Gengar launches a sludge bomb that explodes upon hitting the target!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void gigaDrain(Pokemon enemy) {
        int power = 75;
        int damage = (((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        hp += damage * 0.65;
        if (hp > 600) {
            hp = 600;
        }
        System.out.println("Gengar uses Giga Drain!");
        System.out.println("Gengar uses the power of nature to drain his opponent's life force and makes it his own");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
        System.out.println(name + " Absorbs " + damage * 0.65 + " HP from " + enemy.name);
    }

    public void dreamEater(Pokemon enemy) {
        int power = 100;
        int damage = (((2*level)/5 + 2) * power * spAttack/enemy.getSpDefence()) / 50 + 2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("Gengar uses Dream Eater!");
        System.out.println("Gengar consumes the dreams of the sleeping target to restore its own health!");
        System.out.println(enemy.name + " Takes " + damage + " Damage!");
    }

    public void sound(){
        System.out.println("Khehehe!");
    }
}
