import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public ZooManagement() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Veuillez entrer le nom du zoo : ");
        zooName = scanner.nextLine().trim();
        while (zooName.isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide. Veuillez entrer un nom valide : ");
            zooName = scanner.nextLine().trim();
        }


        System.out.println("Veuillez entrer le nombre de cages : ");
        while (true) {
            try {
                nbrCages = Integer.parseInt(scanner.nextLine());
                if (nbrCages <= 0) {
                    System.out.println("Erreur : Le nombre de cages doit être positif. Veuillez entrer une valeur valide : ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : Veuillez entrer un nombre entier valide pour le nombre de cages : ");
            }
        }
    }

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}