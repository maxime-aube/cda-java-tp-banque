public class Bank {

    //Launch interactive bank
    public static void main(String[] args) {
        //test exos
        Client clientTest = new Client("Geava");
        clientTest.ajouterCompte(new Compte());
        clientTest.afficherSolde();
    }
}
