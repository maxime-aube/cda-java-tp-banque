import java.util.UUID;
import static java.lang.Math.abs;

public class Compte {

    private UUID numero = UUID.randomUUID();
    private float solde;

    Compte() {
        this.solde = 20; //pas zéro, faut bien attirer les clients
    }

    /**
     * Renvoie le numéro de compte
     */
    public UUID getNumeroCompte() {
        return this.numero;
    }

    /**
     * faire un dépôt sur le compte
     * @param valeur
     */
    public void depot(float valeur) {
        if (valeur > 0 ) {
            this.solde += valeur;
        }
    }

    /**
     * faire un retrait sur le compte
     * @param valeur
     */
    public void retrait(float valeur) {
        this.solde -= valeur;
    }

    /**
     * obtenir la valeur du solde
     */
     public float getSolde() {
        return this.solde;
    }

    /**
     * afficher le solde
     */
    public void afficherSolde() {
        System.out.println("Votre solde est de " + this.solde + " crédit(s).");
    }

    /**
     * fait un virement vers un autre compte
     * @param valeur
     * @param destinataire
     */
    public void virer(float valeur, Compte destinataire) {
        if (this.solde >= abs(valeur)) {
            destinataire.depot(abs(valeur));
            this.solde -= abs(valeur);
        } else {
            System.out.println("Le solde est insuffisant sur ce compte  pour un virement de " + abs(valeur) + " crédit(s).");
        }
    }
}
