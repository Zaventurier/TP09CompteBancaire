package tpBanque;

import java.util.ArrayList;

public class exercice1 {
    public static void main(String[] args) {
        ArrayList<Compte> lesComptes = new ArrayList<Compte>();

        Compte c1 = new Compte(12345, "Dupont", 1000, -500);
        Compte c2 = new Compte(54321, "Sakho", 500, -10000);
        lesComptes.add(c1);
        lesComptes.add(c2);

        for(int i = 0; i<lesComptes.size(); i++){
            System.out.println(lesComptes.get(i).toString());
        }
        for(Compte unCompte : lesComptes){
            System.out.println(unCompte);
        }
    }
}
