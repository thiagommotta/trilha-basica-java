package ex1Lista1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Pessoa {

    private String nome;
    private double altura;
    private LocalDate dataDeNascimento;
    private int idade;

    public Pessoa(String nome, double altura, LocalDate dataDeNascimento, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "A altura de " + this.nome + " é " + this.altura + " . Ele nasceu em "
                + DateTimeFormatter.ofPattern("dd/MM/uuuu").
                withResolverStyle(ResolverStyle.STRICT).format(this.dataDeNascimento) + "\n";
    }

}
