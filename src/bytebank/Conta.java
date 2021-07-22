package bytebank;

public class Conta {
    private double saldo;
    private final int agencia;
    private final int numero;
    private final Cliente titular;

    //atributos de nova conta sempre serão setados na criação da conta
    //exceto por "saldo", que inicializará com valor 0

    public Conta( int agencia, int numero, String nomeTitular, String profissaoTitular, String cpfTitular) {

        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, profissaoTitular, cpfTitular);
    }

    public void deposita(double valor){
        this.saldo =+ valor;
        System.out.println("Depósito realizado com sucesso");
    }

    public void saca(double valor){
        if(this.saldo>=valor){
            this.saldo=-valor;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void transferePorCpf(double valor,String cpf, SistemaDeContas lista){
        if((this.saldo>=valor) || (lista.procuraConta(cpf)!=null)){
            this.saldo=-valor;
            lista.procuraConta(cpf).saldo=+valor;
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void transferePorNumero(double valor,int numero, SistemaDeContas lista){
        if((this.saldo>=valor) || (lista.procuraConta(numero)!=null)){
            this.saldo=-valor;
            lista.procuraConta(numero).saldo=+valor;
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

}



