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
        if (!estaOcupado()) this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        if (!estaOcupado()) this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
        if (!estaOcupado()) this.morango = morango;
    }

    public void colher(Celeiro celeiro) {
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
}