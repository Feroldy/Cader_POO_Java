public class ClientPhysique extends Client {
    void retirer(float montant){
        if (solde-montant>=50000) {
            solde = solde -montant;
            System.out.println("Retrait effectuer nouveau solde XAF "+solde);
        }
        else{
            System.out.println("Retrait refusé");
        }

    }
    void emprunter(float montant){
        if (nombreDepot>=10 || montant<=solde*10){
            solde=solde+montant;
            System.out.println("Emprunt possible ");
            System.out.println("Nouveau solde XAF "+solde);}
        else {
            System.out.println("Emprunt not possible");
        }
    }
}
