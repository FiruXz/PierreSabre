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
        int argentVol� = victime.getArgent(); 
        victime.seFaireExtorquer(); 
        gagnerArgent(argentVol�); 
        reputation++; 
        parler("J'ai piqu� les " + argentVol� + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

}
