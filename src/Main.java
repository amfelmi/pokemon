import java.util.Scanner;
import java.util.Random;
public class Main {
    static Pikachu p;
    static Gengar g;
    static int player; // Use in game if statement so player can select ability.
    public static void main(String[] args) {
        Title.getTitle();
        startGame();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPikachu's HP: " + p.hp);
            System.out.println("Gengar's HP: " + g.hp);
            Scanner entry = new Scanner(System.in);

            if (p != null && p.isDefeated()) {
                System.out.println("Pikachu has fainted! Gengar wins!");
                System.out.println("Pikachu got 14252 EXP.");
                System.out.println("Pikachu Leveled up");
                System.out.println("Pikachu Leveled up");
                System.out.println("Pikachu Leveled up");
                System.out.println("Pikachu Leveled up");
                System.out.println("Pikachu Leveled up");
                break;
            }
            if (g != null && g.isDefeated()) {
                System.out.println("Gengar has fainted! Pikachu wins!");
                System.out.println("Gengar got 14252 EXP.");
                System.out.println("Gengar Leveled up");
                System.out.println("Gengar Leveled up");
                System.out.println("Gengar Leveled up");
                System.out.println("Gengar Leveled up");
                System.out.println("Gengar Leveled up");
                break;
            }

            // Player move
            if (player == 10) {
                System.out.println("\nPikachu's turn! Choose a move:");
                System.out.println("1: Volt Tackle");
                System.out.println("2: Iron Tail");
                System.out.println("3: Thunder");
                System.out.println("4: Quick Attack");

                int input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> p.voltTackle(g);
                    case 2 -> p.ironTail(g);
                    case 3 -> p.thunder(g);
                    case 4 -> p.quickAttack(g);
                    default -> System.out.println("Invalid move. Pikachu skips its turn.");
                }
                // CPU
                System.out.println("\n Champion Cynthia's Turn");
                // Pause
                System.out.println("Press Enter to Continue");
                scanner.nextLine();

                Random random = new Random();
                int cpuInput = random.nextInt(4) + 1;

                switch (cpuInput) {
                    case 1 -> g.shadowBall(p);
                    case 2 -> g.sludgeBomb(p);
                    case 3 -> g.gigaDrain(p);
                    case 4 -> g.dreamEater(p);
                    default -> System.out.println("Invalid move. Gengar skips its turn.");
                }
                // Pause
                System.out.println("Press Enter to Continue");
                entry.nextLine();

            } else {
                System.out.println("\nGengar's turn! Choose a move:");
                System.out.println("1. Shadow Ball");
                System.out.println("2. Sludge Bomb");
                System.out.println("3. Giga Drain");
                System.out.println("4. Dream Eater");

                int input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> g.shadowBall(p);
                    case 2 -> g.sludgeBomb(p);
                    case 3 -> g.gigaDrain(p);
                    case 4 -> g.dreamEater(p);
                    default -> System.out.println("Invalid move. Gengar skips its turn.");
                }

                // CPU
                System.out.println("\n Ash's Turn");
                // Puase
                System.out.println("Press Enter to Continue");
                entry.nextLine();

                Random random = new Random();
                int cpuInput = random.nextInt(4) + 1;

                switch (cpuInput) {
                    case 1 -> p.voltTackle(g);
                    case 2 -> p.ironTail(g);
                    case 3 -> p.thunder(g);
                    case 4 -> p.quickAttack(g);
                    default -> System.out.println("Invalid move. Pikachu skips its turn.");
                }
                // Pause
                System.out.println("Press Enter to Continue");
                entry.nextLine();
            }
        }

    }

    public static void startGame(){
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Please choose 1 for Pikachu or 2 for Gengar:");
        String inputValue = sc.nextLine();

        if(inputValue.equals("1")){
            System.out.println("Pikachu! I choose you!");
            System.out.println("Champion Cynthia takes out her final pokemon. It's Gengar!");
            p = new Pikachu("Pikachu", "Electric", 10, 150, 90, 90, 55, 80);
            g = new Gengar("Gengar", "Ghost", 10, 150, 65, 130, 60, 75);
            player = 10;
            break;
        }
        else if (inputValue.equals("2")){
            System.out.println("Gengar! I choose you!");
            System.out.println("Ash takes out his final pokemon. It's Pikachu!");
            g = new Gengar("Gengar", "Ghost", 10, 150, 65, 130, 60, 75);
            p = new Pikachu("Pikachu", "Electric", 10, 150, 90, 90, 55, 80);
            player = 20;
            break;
        }
        else {
            System.out.println("Error! Stop being a fool and choose either 1 or 2 and press Enter!");
        }
    }
    }
}

//switch (input) {
//        case 1:
//        g.shadowBall(p);
//        break;
//        case 2:
//        g.sludgeBomb(p);
//        break;
//        case 3:
//        g.gigaDrain(p);
//        break;
//        case 4:
//        g.dreamEater(p);
//        break;
//default:
//        System.out.println("Invalid move. Gengar skips its turn.");
//        }