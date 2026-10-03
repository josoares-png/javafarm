package br.com.joaocarloslima;

public class Batata {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Batata(int tamanho){
        this.tamanho = tamanho;
        this.tempoDeVida = 1;
        this.tempoDeCrescimento = 3;
    }

    public void crescer(){
        this.tempoDeVida +=1;
        if (this.tempoDeVida >= this.tempoDeCrescimento  && this.tamanho < 4){
            this.tamanho += 1;
        }
    }

    public boolean podeColher(){
       return this.tamanho == 4;
    }

    public String getImagem(){
        return "/images/batata" + tamanho + ".png";
    }


}
