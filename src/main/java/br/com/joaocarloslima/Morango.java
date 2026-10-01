package br.com.joaocarloslima;

public class Morango {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango(int tamanho, int tempoDeVida, int tempoDeCrescimento){
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer(){
        this.tamanho += 1;
        this.tempoDeVida +=1;
    }

    public boolean podeColher(){
        if(this.tempoDeVida <= this.tempoDeCrescimento){
            return true;
        }
        return false;
    }

    public String getImagem(){
        return "imagem/morango" + tamanho + "png";
    }
}
