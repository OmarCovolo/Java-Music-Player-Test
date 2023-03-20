package JavaPlayer;

public class Video extends Element implements Playinterface, Luminterface {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    
    public int getDurata() {
        return durata;
    }


    public void setDurata(int d) {
        this.durata = d;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int l) {
        this.luminosita = l;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.print(getTitolo() + ", volume:  ");
            for (int j = 0; j < getVolume(); j++) {
                System.out.print("!");
            }
            System.out.print(" - luminosita: ");
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
