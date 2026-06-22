import java.util.Scanner;

public class Client {
        String nom ;
        int numeroCompte;
        float solde ;
        int nombreDepot;
        void deposer(float montant) {
            if(montant<5000){
                System.out.println("Depot refused");
            }
            else if(montant>=5000){
                System.out.println("Depot accepted");
            }
            solde = solde +montant;
            nombreDepot=nombreDepot+1;
        }
        void retirer(float montant){
            if (solde-montant>=5000) {
                solde = solde -montant;
            }
                else{
                    System.out.println("Retrait refusé");
                }

        }
        void emprunter(float montant){
            if (nombreDepot>=20 || montant<=solde*4){
                solde=solde+montant;
                System.out.println("Emprunt possible ");}
            else {
                System.out.println("Emprunt not possible");
            }
        }
    }

