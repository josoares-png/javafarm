package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.qtdeBatatas = 0;
        this.qtdeCenouras = 0;
        this.qtdeMorangos = 0;
    }

    public void armazenarBatata() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("Celeiro cheio!!!");
        }
        this.qtdeBatatas +=2;
    }

    public void armazenarCenoura() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("Celeiro cheio!!!");
        }
        this.qtdeCenouras +=2;
    }

    public void armazenarMorango() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("Celeiro cheio!!!");
        }
        this.qtdeMorangos +=2;
    }

    public void consumirBatata() throws Exception{
        if (this.qtdeBatatas <= 0){
            throw new Exception("Não há batatas suficientes para consumir");
        }
        this.qtdeBatatas --;
    }

    public void consumirCenoura() throws Exception{
        if (this.qtdeCenouras <= 0){
            throw new Exception("Não há cenouras suficientes para consumir");
        }
        this.qtdeCenouras --;
    }

    public void consumirMorango() throws Exception{
        if (this.qtdeMorangos <= 0){
            throw new Exception("Não há morangos suficientes para consumir");
        }
        this.qtdeMorangos --;
    }

    public int getEspacoDisponivel(){
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public double getOcupacao(){
        return ((double) (qtdeMorangos + qtdeCenouras + qtdeBatatas) / capacidade) * 100;
    }

    public boolean celeiroCheio(){
        return getOcupacao() <=0;
    }



    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}