package ex3Lista1;

public class Elevador {

    private int andarAtual = 0;
    private final int totalAndares;
    private final int capacidade;
    private int pessoasPresentes = 0;


    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }


}
