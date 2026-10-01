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

    public int getEspacoDisponivel(){
        return this.capacidade - getOcupacao();
    }

    public int getOcupacao(){
        if(this.capacidade == 0) return 0;
        return ((double) getOcupacao() / this.capacidade * 100;
    }

    public boolean celeiroCheio(){
        return getOcupacao() >= this.capacidade;
    }

    private int getOcupacaoTotal(){
        return  this.qtdeBatatas + this.qtdeCenouras + this.qtdeMorangos;
    }

    public void armazenarBatata() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception(" Espaço insuficiente no celeiro para armazenar batatas.");
        }
        this.qtdeBatatas +=2;
    }

    public void armazenarCenoura() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception(" Espaço insuficiente no celeiro para armazenar cenouras.");
        }
        this.qtdeCenouras +=2;
    }

    public void armazenarMorango() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception(" Espaço insuficiente no celeiro para armazenar cenouras.");
        }
        this.qtdeMorangos +=2;
    }

    public void consumirBatata() throws Exception{
        if (this.qtdeBatatas < 1){
            throw new Exception("Não há batatas suficientes para consumir");
        }
        this.qtdeBatatas -=1;
    }

    public void consumirCenoura() throws Exception{
        if (this.qtdeCenouras < 1){
            throw new Exception("Não há cenouras suficientes para consumir");
        }
        this.qtdeCenouras -=1;
    }

    public void consumirMorango() throws Exception{
        if (this.qtdeMorangos < 1){
            throw new Exception("Não há morangos suficientes para consumir");
        }
        this.qtdeMorangos -=1;
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