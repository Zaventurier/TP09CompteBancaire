package tpBanque;

public class Compte {
    private int numero;
    private String nom;
    private float solde;
    private float decouvertAutorise;

    //Acceceurs

    public int getNumero(){
        return this.numero;
    }
    public String getNom(){
        return this.nom;
    }
    public float getSolde(){
        return this.solde;
    }
    public float getDecouvertAutorise(){
        return this.decouvertAutorise;
    }

    //Modificateurs

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setSolde(float solde){
        this.solde = solde;
    }
    public void setDecouvertAutorise(float decouvertAutorise){
        this.decouvertAutorise = decouvertAutorise;
    }

    //Constructeurs de la class

    //Constructeur par défaut
    public Compte(){
        this.numero = 0;
        this.nom = "";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }
    //Deuxième constructeur
    public Compte(int numero, String nom, float solde, float decouvertAutorise){
        this.numero = numero;
        this.nom = nom;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    //Méthodes

    public void Crediter(float montant){
        this.solde = this.solde + montant;
        System.out.println("Votre solde à bien été mis à jour !");
    }
    public boolean Debiter(float montant){
        if(montant>this.decouvertAutorise){
            return false;
        }else{
            this.solde = this.solde - montant;
            return true;
        }
    }
    public boolean Transferer(Compte autreCompte,float montant){
        if(montant>this.decouvertAutorise){
            return false;
        }else{
            autreCompte.solde = autreCompte.solde + montant;
            return true;
        }
    }
    public boolean estSuperieur(Compte autreCompte){
        if(this.solde > autreCompte.solde){
            return true;
        }else{
            return false;
        }
    }


}
