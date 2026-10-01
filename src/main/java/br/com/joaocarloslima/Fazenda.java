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
        if(celeiro.getQtdeBatatas() <= 0){
            throw new Exception("Não há batatas no celeiro para plantar");
        }

        Terreno terreno = getTerreno(x, y);
        if (!terreno.estaOcupado()){
            throw new Exception("O terreno ja está ocupado");
        }

        terreno.plantar("Batata");
        celeiro.consumirBatata();
    }


    public void plantarCenoura(int x, int y) throws Exception {
        if(celeiro.getQtdeCenouras() <= 0){
            throw new Exception("Não há cenouras no celeiro para plantar");
        }

        Terreno terreno = getTerreno(x, y);
        if (!terreno.estaOcupado()){
            throw new Exception("O terreno ja está ocupado");
        }

        terreno.plantar("Cenoura");
        celeiro.consumirCenoura();
    }

    public void plantarMorango(int x, int y) throws Exception {
        if(celeiro.getQtdeMorangos() <= 0){
            throw new Exception("Não há morangos no celeiro para plantar");
        }

        Terreno terreno = getTerreno(x, y);
        if (!terreno.estaOcupado()){
            throw new Exception("O terreno ja está ocupado");
        }

        terreno.plantar("Morango");
        celeiro.consumirMorango();
    }

    public void colher(int x, int y) throws Exception {
        Terreno terreno = getTerreno(x, y);
        if (terreno.celeiroCheio()){

        }
    }





}
