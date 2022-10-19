package tpBanque;

public class Banque {
    public static void main(String[] args) {
        Compte c = new Compte();
        Compte c1 = new Compte(12345, "toto", 1000, -500);
        Compte c2 = new Compte(12346, "titi", 2000, -1000);
        /*c1.Crediter(2000);
        c1.Debiter(5300);*/
        Ecran.afficher(c1);
        Ecran.afficher(c2);
        System.out.println("Trabsfère en cours...");
        if(c1.Transferer(c2,1300) == false){
            System.out.println("Débit impossible");
        }else{
            System.out.println("Débit possible");
        }
        Ecran.afficher(c1);
        Ecran.afficher(c2);

        if(c1.estSuperieur(c2)){
            System.out.println("superieur");
        }else{
            System.out.println("inférieur");
        }

    }
}