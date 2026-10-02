package br.com.joaocarloslima;

public class Cenoura {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura(int tamanho){
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
        return "imagem/cenoura" + tamanho + "png";
    }
}
