package ex1Lista1;

import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    public static void main(String[] args) {
       Agenda teste = new Agenda();
       List<Integer> lista = new ArrayList<Integer>();

       lista.add(1);
       lista.add(2);
       lista.add(3);

       teste.armazenaPessoa("Pedro",1.38,"30/09/1978");
       teste.armazenaPessoa("Tiago",1.38,"30/09/1978");
       teste.armazenaPessoa("João",1.38,"30/09/1978");
       teste.armazenaPessoa("André",1.38,"30/09/1978");
       teste.armazenaPessoa("Filipe",1.38,"30/09/1978");
       teste.armazenaPessoa("Bartolomeu",1.38,"30/09/1978");
       teste.armazenaPessoa("Mateus",1.38,"30/09/1978");
       teste.armazenaPessoa("Tomé",1.38,"30/09/1978");
       teste.armazenaPessoa("Tadeu",1.38,"30/09/1979");
       teste.armazenaPessoa("Simão",1.38,"30/09/1977");
       teste.armazenaPessoa("Judas",1.38,"30/09/1976");

       System.out.println(teste.buscaPessoa("PAuilo"));
       //teste.imprime();
       teste.removePessoa("mateus");
       teste.imprimeAgenda();
       teste.imprimePessoa(2);
    }
}
