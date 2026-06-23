public class ClientMoral extends Client {
    void retirer(float montant){
        if (solde-montant>=5000) {
            solde = solde -montant;
            System.out.println("Retrait effectuer nouveau solde XAF "+solde);
        }
        else{
            System.out.println("Retrait refusé");
            System.out.println("Lors du retrait le solde restant dans le compte doit etre >=5000");
        }

    }
    void emprunter(float montant){
        if (nombreDepot>=30 || montant<=solde*5){
            solde=solde+montant;
            System.out.println("Emprunt possible ");
            System.out.println("Nouveau solde XAF "+solde);}
        else {
            System.out.println("Emprunt not possible");
        }
    }
}
