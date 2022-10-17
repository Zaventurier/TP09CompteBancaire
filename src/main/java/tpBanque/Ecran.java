package tpBanque;

public class Ecran {
    public static void afficher(Compte unCompte){
        System.out.println(unCompte.getNumero() + " ; " + unCompte.getNom() + " ; " + unCompte.getSolde() + " ; " + unCompte.getDecouvertAutorise());
    }
}
