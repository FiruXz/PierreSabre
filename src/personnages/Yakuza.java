package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String clan, int argent) {
        super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = 0; 
    }

    public void extorquer(Commercant victime) {
        int argentVolé = victime.getArgent();
        victime.seFaireExtorquer();
        gagnerArgent(argentVolé);
        reputation++;
        parler("J'ai piqué les " + argentVolé + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    protected void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("J'ai gagné " + gain + " sous ! Ma réputation augmente !");
    }

    protected int perdre() {
        int argentPerdu = getArgent();
        parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        argentPerdu = 0; 
        reputation--; 
        return argentPerdu; 
    }

    public int getReputation() {
        return reputation;
    }

    public String getClan() {
        return clan; 
    }
}
