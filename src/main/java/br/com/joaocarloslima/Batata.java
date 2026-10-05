package br.com.joaocarloslima;

public class Batata {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Batata(int tamanho){
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer(){
        this.tamanho += 1;
        this.tempoDeVida +=1;
    }

    public boolean podeColher() {
        return this.tamanho == 4;
    }

    public String getImagem(){
        return "imagem/batata" + tamanho + "png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }
}