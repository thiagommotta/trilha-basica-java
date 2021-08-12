package ex3Lista1;


public class ElevadorService {

    public Elevador inicicilizaElevador(int totalAndares, int capacidade){
        if(capacidade<0||totalAndares<0)
            throw new IllegalArgumentException("Informação inserida não pode ser negatvia");
        return new Elevador(totalAndares, capacidade);
    }

    public void entraUmaPessoa(Elevador elevador){
        if (elevador.getPessoasPresentes()== elevador.getCapacidade())
            throw new RuntimeException("Elevador Cheio, ninguem pode entrar");
        elevador.setPessoasPresentes(elevador.getPessoasPresentes()+1);
    }

    public void saiUmaPessoa(Elevador elevador){
        if (elevador.getPessoasPresentes()== 0)
            throw new RuntimeException("Elevador Vazio, não tem ninguem para sair");
        elevador.setPessoasPresentes(elevador.getPessoasPresentes()-1);
    }

    public void sobe(Elevador elevador){
        if (elevador.getAndarAtual()== (elevador.getTotalAndares()))
            throw new RuntimeException("Elevador no ultimo andar, não pode subir mais");
        elevador.setAndarAtual(elevador.getAndarAtual()+1);
    }

    public void desce(Elevador elevador){
        if (elevador.getAndarAtual()== 0)
            throw new RuntimeException("Elevador no térreo, não pode descer mais");
        elevador.setAndarAtual(elevador.getAndarAtual()-1);
    }

}
