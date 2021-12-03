import java.util.UUID;

public class Bank {

    //Launch interactive bank
    public static void main(String[] args) {

        //test exos
        BanqueInteractive bank = new BanqueInteractive();

        Client clientTest1 = bank.ajouterClient("Geava");
        Client clientTest2 = bank.ajouterClient("Péache Pé");
        Client clientTest3 = bank.ajouterClient("Gea vascripte");

        Compte compteTest1 = clientTest1.ajouterCompte();
        compteTest1.retrait(99);

        bank.bilanClient(clientTest1.getUUID());
        bank.afficherBilan();
        bank.interaction();
    }
}
