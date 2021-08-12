package ex1Lista1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class PessoaService {

    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/uuuu").
            withResolverStyle(ResolverStyle.STRICT);

    public Pessoa cadastrarPessoa(String nome, double altura, String dataDeNascimento){
        try{
            return new Pessoa(nome, altura, formataData(dataDeNascimento), calculaIdade(formataData(dataDeNascimento)));
        }catch (Exception ex){
            throw new IllegalArgumentException("Data inserida inválida");
        }
    }

    public String nomePessoa(Pessoa pessoa){
        return pessoa.getNome();
    }

    public LocalDate formataData(String data){
        return LocalDate.parse(data, formatoData);
    }

    public int calculaIdade(LocalDate dataDeNascimento){
        return Period.between(dataDeNascimento,LocalDate.now()).getYears();
    }

}
