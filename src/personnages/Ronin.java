package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, int argent) {
        super(nom, "shochu", argent);
        this.honneur = 1; 
    }
    protected void gagner(int gain) {
        gagnerArgent(gain);
        parler("J'ai gagn� " + gain + " sous ! Ma r�putation augmente, et je suis le meilleur ! Ha ha !");
    }

    protected int perdre() {
        int argentPerdu = getArgent();
        parler("J�ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai d�shonor� le clan de " + clan + ".");
        argentPerdu = 0;
        return argentPerdu; 
    }
    // FONCTION PROVOQUER ERREUR SINON TP 4 FINIT
    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        parler("Je t'ai trouv�, " + adversaire.getNom() + "! Pr�pare-toi � payer pour tes crimes!");

        if (force >= adversaire.getReputation()) {
            int argentGagn� = adversaire.getArgent();
            gagner(argentGagn�); 
            adversaire.perdre(); 
            parler("J'ai gagn� le duel ! J'ai pris " + argentGagn� + " sous � " + adversaire.getNom() + " !");
        } else {
            int argentPerdu = getArgent();
            adversaire.gagner(argentPerdu); 
            honneur--; 
            perdre(); 
            parler("J'ai perdu contre " + adversaire.getNom() + ", mon honneur et ma bourse ont en pris un coup.");
        }
    }

    public int getHonneur() {
        return honneur;
    }
}
