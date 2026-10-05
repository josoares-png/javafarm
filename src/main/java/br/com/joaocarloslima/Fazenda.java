package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda(){
        this.terrenos = new ArrayList<>();
        this.celeiro = new Celeiro(50);

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                this.terrenos.add(new Terreno(i, j));
            }
        }
    }

    public Terreno getTerreno(int x, int y) {
        for (Terreno t : terrenos) {
            if (t.getX() == x && t.getY() == y) {
                return t;
            }
        }
        return null;
    }

    public void plantarBatata(int x, int y) throws Exception {
        celeiro.consumirBatata();
        getTerreno(x, y).plantar(new Batata(3));
    }

    public void plantarCenoura(int x, int y) throws Exception {
        celeiro.consumirCenoura();
        getTerreno(x, y).plantar(new Cenoura(3));
    }

    public void plantarMorango(int x, int y) throws Exception {
        celeiro.consumirMorango();
        getTerreno(x, y).plantar(new Morango(3));
    }

    public void colher(int x, int y) throws Exception {
         getTerreno(x, y).colher(celeiro);
    }

    public void colher(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t != null) {
            t.colher(this.celeiro);
        }
    }

    public void passarCiclo() {
        for (Terreno t : terrenos) {
            t.atualizarCiclo();
        }
    }

    public Celeiro getCeleiro() { return celeiro; }
    public List<Terreno> getTerrenos() { return terrenos; }
}