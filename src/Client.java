public class Client {

    private String nom;
    private Compte [] comptes = new Compte[100];
    private int nbComptes = 0;

    Client(String nom) {
        this.nom = nom;
        this.comptes[0] = new Compte();
        this.nbComptes++;
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
       int sum = 0;
       for (int i = 0; i < this.nbComptes; i++) {
            sum+= this.comptes[i].getSolde();
        }
        return sum;
    }

    /**
     * affiche le solde du compte client
     */
    void afficherSolde() {
        System.out.println("Le solde de " + this.nom + " est de " + this.getSolde() + " crédit(s).");
    }

    /**
     * ajoute un compte au client
     */
    void ajouterCompte(Compte compte) {
        this.comptes[this.nbComptes] = compte;
        this.nbComptes++;
    }
}
