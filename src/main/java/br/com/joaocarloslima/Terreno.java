package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Morango morango;
    private Cenoura cenoura;
    private int x, y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata) {
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
         this.morango = morango;
    }

    public void colher(Celeiro celeiro) throws Exception {
        if (batata != null && batata.podeColher()) {
            celeiro.armazenarBatata();
            batata = null;
        } else if (cenoura != null && cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            cenoura = null;
        } else if (morango != null && morango.podeColher()) {
            celeiro.armazenarMorango();
            morango = null;
        }

    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Batata getBatata() {
        return batata;
    }

    public Morango getMorango() {
        return morango;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }
}