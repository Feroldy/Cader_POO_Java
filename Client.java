public class Client {
        String nom ;
        int numeroCompte;
        float solde ;
        int nombreDepot;
        void deposer(float montant) {
            solde = solde +montant;
            nombreDepot++;
            if(montant<5000){
                System.out.println("Depot refused");
                System.out.println("Cher client pour effectuer un depot veuillez entrer 5000 ou plus");
            }
            else if(montant>=5000){
                System.out.println("Depot accepted");
                System.out.println("Depot effectuer nouveau solde XAF "+solde);
            }
        }
        void retirer(float montant){
            if (solde-montant>=5000) {
                solde = solde -montant;
                System.out.println("Retirer effectuer nouveau solde XAF "+solde);
            }
                else{
                    System.out.println("Retrait refusé");
                    System.out.println("Lors du retrait le solde restant dans le compte doit etre >=5000");

                }

        }
        void emprunter(float montant){
            if (nombreDepot>=20 || montant>=solde*4){
                solde=solde+montant;
                System.out.println("Emprunt possible ");
                System.out.println("Nouveau solde XAF "+solde);}
            else {
                System.out.println("Emprunt not possible");
            }
        }
    }

