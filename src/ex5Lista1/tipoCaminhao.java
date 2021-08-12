package ex5Lista1;

public enum tipoCaminhao {
    ALFA (6000),
    BETA (10000);

    private double capacidade;

    tipoCaminhao(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

}
