package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    private final int Linhas = 13;
    private final int Colunas = 13;

    public Fazenda(){
        this.celeiro = new Celeiro(100);
        this.terrenos = new ArrayList<>();

        for(int x = 0; x < Linhas; x++) {
            for(int y = 0; y < Colunas; y++){
                this.terrenos.add(new Terreno(x, y));
            }
        }
    }

    public Terreno getTerreno(int x, int y) throws Exception {
        for(Terreno terreno : terrenos){
            if (terreno.getX() == x && terreno.getY() == y){
                return  terreno;
            }
        }
        throw new Exception("Coordenadas fora do lismites do terrono");
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

    public Celeiro getCeleiro(){
        return celeiro;
    }

}
