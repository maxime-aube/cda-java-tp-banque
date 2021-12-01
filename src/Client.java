import java.util.UUID;

public class Client {

    private UUID numeroClient = UUID.randomUUID();
    private String nom;
    private Compte [] comptes = new Compte[100];
    private int nbComptes = 0;

    Client(String nom, UUID numeroClient) {
        this.nom = nom;
        this.comptes[0] = new Compte();
        this.nbComptes++;
    }

    /**
     * renvoie l'identifiant du client
     */
    public UUID getUUID(){
        return this.numeroClient;
    }

    /**
     * renvoie le nom du client
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * renvoie le solde des comptes du client
     */
    public float getSolde() {
       int sum = 0;
       for (int i = 0; i < this.nbComptes; i++) {
            sum+= this.comptes[i].getSolde();
        }
        return sum;
    }

    /**
     * affiche le solde du compte client
     */
    public void afficherSolde() {
        System.out.println("Le solde de " + this.nom + " est de " + this.getSolde() + " crédit(s).");
    }

    /**
     * ajoute un compte au client
     */
    public Compte ajouterCompte() {
        Compte compte = new Compte();
        this.comptes[this.nbComptes] = compte;
        this.nbComptes++;
        return compte;
    }
}
