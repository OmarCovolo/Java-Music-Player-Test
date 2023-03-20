package JavaPlayer;

abstract public class Element {
    private String titolo;

    public Element(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String t) {
        this.titolo = t;
    }
}
