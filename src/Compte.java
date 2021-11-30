import java.util.UUID;

public class Compte {

    private UUID numero;
    private float solde;

    Compte() {
        this.numero = UUID.randomUUID();
        this.solde = 20; //pas zéro, faut bien attirer les clients
    }

    /**
     * faire un dépôt sur le compte
     * @param valeur
     */
    void depot(float valeur) {
        if (valeur > 0 ) {
            this.solde += valeur;
        }
    }

    /**
     * faire un retrait sur le compte
     * @param valeur
     */
    void retrait(float valeur) {
        if (valeur > 0 && this.solde >= valeur) {
            this.solde -= valeur;
        }
    }

    /**
     * obtenir la valeur du solde
     */
     float getSolde() {
        return this.solde;
    }

    /**
     * afficher le solde
     */
    void afficherSolde() {
        System.out.println("Votre solde est de " + this.solde + " crédit(s).");
    }

    /**
     * fait un virement vers un autre compte
     * @param valeur
     * @param destinataire
     */
    void virer(float valeur, Compte destinataire) {

    }
}
