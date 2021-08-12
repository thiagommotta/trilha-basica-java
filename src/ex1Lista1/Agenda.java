package ex1Lista1;

import java.util.List;

public class Agenda {
    private List<Pessoa> agenda = new AgendaList<>();
    private PessoaService service = new PessoaService();


    public void armazenaPessoa(String nome, double altura, String dataDeNascimento){
        this.agenda.add(this.service.cadastrarPessoa(nome, altura, dataDeNascimento));
    }

    public int buscaPessoa(String nome){
        for (Pessoa pessoa : this.agenda){
            if(nome.equalsIgnoreCase(pessoa.getNome())){
                return this.agenda.indexOf(pessoa);
            }
        }
        return -1;
    }

    public void imprimePessoa(int posicao){
        System.out.println(this.agenda.get(posicao).toString());
    }

    public void imprimeAgenda(){
        this.agenda.forEach(x ->System.out.println(x));
    }

    public void removePessoa(String nome) {
        this.agenda.remove(buscaPessoa(nome));
    }


}
