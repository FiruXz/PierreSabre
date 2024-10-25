package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, int argent) {
        super(nom, "shochu", argent);
        this.honneur = 1; 
    }
    protected void gagner(int gain) {
        gagnerArgent(gain);
        parler("J'ai gagné " + gain + " sous ! Ma réputation augmente, et je suis le meilleur ! Ha ha !");
    }

    protected int perdre() {
        int argentPerdu = getArgent();
        parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        argentPerdu = 0;
        return argentPerdu; 
    }
    // FONCTION PROVOQUER ERREUR SINON TP 4 FINIT
    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        parler("Je t'ai trouvé, " + adversaire.getNom() + "! Prépare-toi à payer pour tes crimes!");

        if (force >= adversaire.getReputation()) {
            int argentGagné = adversaire.getArgent();
            gagner(argentGagné); 
            adversaire.perdre(); 
            parler("J'ai gagné le duel ! J'ai pris " + argentGagné + " sous à " + adversaire.getNom() + " !");
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
