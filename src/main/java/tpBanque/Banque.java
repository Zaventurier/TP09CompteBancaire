package tpBanque;

public class Banque {
    public static void main(String[] args) {
        Compte c = new Compte();
        Compte c1 = new Compte(12345, "toto", 1000, -500);
        Compte c2 = new Compte(12346, "titi", 2000, -1000);
        c1.Crediter(2000);
        c1.Debiter(5300);
        Ecran.afficher(c);
        Ecran.afficher(c1);

    }
}