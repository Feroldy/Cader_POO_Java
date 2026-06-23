import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClientMoral someone = new ClientMoral();
        System.out.println("Veuillez entrer votre nom ");
        someone.nom = sc.nextLine();
        System.out.println("Veuillez entrer votre numero de compte ");
        while (!sc.hasNextInt()) {
            System.out.println("Veuillez entrer des nombre ");
            sc.next();
        }
        someone.numeroCompte = sc.nextInt();
        someone.solde = 0;
        int choix = 0;
        do {
            System.out.println(" Que voulez vous faire ?");
            System.out.println("1- Deposer");
            System.out.println("2- Retirer");
            System.out.println("3- Emprunter");
            System.out.println("4- Quitter");
            while (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer des nombre ");
                sc.next();
            }
            choix = sc.nextInt();
            while (choix < 1 || choix > 4) {
                System.out.println("Desole mauvais choix ");
                choix = sc.nextInt();
            }
            if (choix == 1) {
                System.out.println("montant a deposer ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Veuillez entrer des nombre ");
                    sc.next();
                }
                float montant = sc.nextFloat();
                someone.deposer(montant);
            } else if (choix == 2) {
                System.out.println("montant a retirer ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Veuillez entrer des nombre ");
                    sc.next();
                }
                float montant = sc.nextFloat();
                someone.retirer(montant);
            } else if (choix == 3) {
                System.out.println("montant a emprunter ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Veuillez entrer des nombre ");
                    sc.next();
                }
                float montant = sc.nextFloat();
                someone.emprunter(montant);
            }
        } while (choix != 4);


        //pour une entreprise
        System.out.println("Voulez vous passer en mode entrprise ?");
        System.out.println("1.Oui 2.Non");
        while (!sc.hasNextFloat()) {
            System.out.println("Veuillez entrer des nombre ");
            sc.next();
        }
        int choisir = sc.nextInt();
        while (choisir != 1 && choisir != 2) {
            System.out.println("Commande invalide réessayez");
            choisir = sc.nextInt();
        }
        if (choisir == 1) {
            ClientPhysique entreprise = new ClientPhysique();
            System.out.println("Veuillez entrer le  nom de l'entreprise ");
            entreprise.nom = sc.nextLine();
            System.out.println("Veuillez entrer votre numero de compte ");
            while (!sc.hasNextInt()) {
                System.out.println("Veuillez entrer des nombre ");
                sc.next();
            }
            entreprise.numeroCompte = sc.nextInt();
            entreprise.solde = 0;
            int choice = 0;
            do {
                System.out.println(" Que voulez vous faire ?");
                System.out.println("1- Deposer");
                System.out.println("2- Retirer");
                System.out.println("3- Emprunter");
                System.out.println("4- Quiter");
                while (!sc.hasNextInt()) {
                    System.out.println("Veuillez entrer des nombre ");
                    sc.next();
                }
                choice = sc.nextInt();
                while (choice <= 0 || choice >= 4) {
                    System.out.println("Desole mauvais choix ");
                    choice = sc.nextInt();
                }
                if (choice == 1) {
                    System.out.println("montant a deposer ");
                    while (!sc.hasNextFloat()) {
                        System.out.println("Veuillez entrer des nombre ");
                        sc.next();
                    }
                    float montant = sc.nextFloat();
                    entreprise.deposer(montant);
                } else if (choice == 2) {
                    System.out.println("montant a retirer ");
                    while (!sc.hasNextFloat()) {
                        System.out.println("Veuillez entrer des nombre ");
                        sc.next();
                    }
                    float montant = sc.nextFloat();
                    entreprise.retirer(montant);
                } else if (choice == 3) {
                    System.out.println("montant a emprunter ");
                    while (!sc.hasNextFloat()) {
                        System.out.println("Veuillez entrer des nombre ");
                        sc.next();
                    }
                    float montant = sc.nextFloat();
                    entreprise.emprunter(montant);
                }
            }while(choice!=4);
        }

        System.out.println("Au revoir ");
    }

}