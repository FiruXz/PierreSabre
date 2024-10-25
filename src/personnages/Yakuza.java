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

}
