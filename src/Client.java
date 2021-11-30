public class Client {

    private String nom;
    private Compte compte = new Compte();

    Client(String nom) {
        this.nom = nom;
    }

    /**
     * renvoie le nom du client
     */
    String getNom() {
        return this.nom;
    }

    /**
     * renvoie le solde du compte client
     */
    float getSolde() {
       return this.compte.getSolde();
    }

    /**
     * affiche le solde du compte client
     */
    void afficherSolde() {
        System.out.println("Le solde de " + this.nom + " est de " + this.getSolde() + " crédit(s).");
    }
}
