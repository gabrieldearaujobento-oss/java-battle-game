import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem p1 = new Personagem(100,true );
        Personagem p2 = new Personagem(100,true);

        System.out.println("=== INÍCIO DA BATALHA ===");

        System.out.println("Digite o nome do primeiro personagem:");
        String name = scanner.nextLine();
        p1.setName(name);

        System.out.println("Digite o nome do segundo personagem:");
        String name2 = scanner.nextLine();
        p2.setName(name2);


        System.out.println("\n=== STATUS INICIAL DOS PERSONAGENS ===");

        p1.mostrarStatus();
        p2.mostrarStatus();

        int round =1;

        while (p1.isAlive() && p2.isAlive()) {
            System.out.println("\n===== ROUND " + round + " =====");

            System.out.println("\nTurno de " + name);
            System.out.print("Informe o dano causado: ");
            int damage1 = scanner.nextInt();
            p1.setDamage(damage1);

            System.out.println("\nTurno de " + name2);
            System.out.print("Informe o dano causado: ");
            int damage2 = scanner.nextInt();
            p2.setDamage(damage2);

            p1.atacar(p2);

            if (!p2.isAlive()) {
                break;
            }

            p2.atacar(p1);

            System.out.println("\n=== STATUS APÓS O ROUND ===");
            System.out.println("Vida de " + p1.getName() + ": " + p1.getLife());
            System.out.println("Vida de " + p2.getName() + ": " + p2.getLife());
            round++;
        }

        System.out.println("\n=== FIM DA BATALHA ===");

        if (p1.isAlive()) {
            System.out.println(name + " venceu a batalha!");
        } else {
            System.out.println(name2 + " venceu a batalha!");
        }

        System.out.println("\nSTATUS FINAL:");

        p1.mostrarStatus();
        p2.mostrarStatus();

    }
}
