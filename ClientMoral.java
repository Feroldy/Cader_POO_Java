public class ClientMoral extends Client {
    void retirer(float montant){
        if (solde-montant>=5000) {
            solde = solde -montant;
        }
        else{
            System.out.println("Retrait refusé");
        }

    }
    void emprunter(float montant){
        if (nombreDepot>=30 || montant<=solde*5){
            solde=solde+montant;
            System.out.println("Emprunt possible ");}
        else {
            System.out.println("Emprunt not possible");
        }
    }
}
