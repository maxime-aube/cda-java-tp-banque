import java.util.UUID;

public class BanqueInteractive {

    private Client[] clients = new Client[1000];
    private int nbClients = 0;

    /**
     * Ajoute un compte client
     * @param clientName
     */
    public Client ajouterClient(String clientName) {
        Client client = new Client(clientName, UUID.randomUUID());
        this.clients[this.nbClients] = client;
        this.nbClients++;
        return client;
    }

    /**
     * affiche le bilan de tous les comptes d’un client
     */
    public void bilanClient(UUID clientUUID) {
        // trouver un client à partir de son UUID
        Client client = this.getClientFromUUID(clientUUID);
        if (client != null) {
            System.out.println("Le client " + client.getNom() + " (id: " + client.getUUID() + ") a un solde total de " + client.getSolde() + " crédit(s).");
        } else {
            System.out.println("Aucun client associé à l'identifiant " + clientUUID + " n'a été trouvé.");
        }
    }

    /**
     * renvoie un compte client à partir d'un UUID client
     */
    private Client getClientFromUUID(UUID clientUUID) {
        for (int i = 0; i < this.nbClients; i++) {
            if (this.clients[i].getUUID() == clientUUID) {
                return this.clients[i];
            }
        }
        return null;
    }

    /**
     * affiche un bilan général de tous les comptes de tous les clients
     */
    public void afficherBilan() {
        int sum = 0;
        for (int i = 0; i < this.nbClients; i++) {
            sum+= this.clients[i].getSolde();
        }
        System.out.println("La somme de tous les comptes clients est de " + sum + " crédit(s).");
    }

    public void interaction() {
        // TODO à faire
    }
}
