package bytebank;

import java.util.ArrayList;

public class SistemaDeContas {
    private final ArrayList<Conta> listaDeContas;

    public SistemaDeContas() {
        listaDeContas = new ArrayList<Conta>();
    }

    public Conta getPosicaoLista(int i) {
        return listaDeContas.get(i);
    }

    public Conta criarConta( int agencia, int numero, String nomeTitular, String profissaoTitular, String cpfTitular){
        Conta novaConta = new Conta(agencia, numero, nomeTitular, profissaoTitular, cpfTitular);
        adicionarContas(novaConta);
        return novaConta;
    }


    public void totalDeContas(){
        System.out.println("Total de Contas: " + this.listaDeContas.size()) ;
    }

    public void adicionarContas(Conta conta){
        this.listaDeContas.add(conta);
    }

    public Conta procuraConta(String cpf){
        for (Conta conta:this.listaDeContas) {
            if(conta.getTitular().getCpf().equals(cpf)){
                return conta;
            }
        }
        return null;
    }

    public Conta procuraConta(int numero){
        for (Conta conta:this.listaDeContas) {
            if(conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }

    public void imprimeTitular(int numeroConta){
        if(procuraConta(numeroConta)!=null){
            System.out.println(procuraConta(numeroConta).getTitular().getNome());
        }else{
            System.out.println("Conta não encontrada");
        }
    }

    public void imprimeTitular(String cpf){
        if(procuraConta(cpf)!=null){
            System.out.println(procuraConta(cpf).getTitular().getNome());
        }else{
            System.out.println("Conta não encontrada");
        }
    }



}
