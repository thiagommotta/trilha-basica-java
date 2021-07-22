package bytebank;

public class Cliente {
    private String nome;
    private String profissao;
    private String cpf;

    //atributos de cliente sempre serão setados na criação da conta
    //único atributo que pode ser alterado é a profissão

    public Cliente(String nome, String profissao, String cpf) {
        this.nome = nome;
        this.profissao = profissao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
