package bytebank;

import java.util.ArrayList;

public class ContaTest {
    public static void main(String[] args) {
        SistemaDeContas sistema = new SistemaDeContas();
        sistema.criarConta(153,2589,"Jhonny","Pedreiro",
                "123456789");

        sistema.criarConta(135,1247,"Jack", "Piloto",
                "321654987");

        sistema.totalDeContas();
        sistema.imprimeTitular("321654987");
        //sistema.deposita(500);
        //conta2.deposita(300);
        //System.out.println(conta1.getSaldo());
        //System.out.println(conta2.getSaldo());
        //conta1.transferePorNumero(150,1247,lista);
        //System.out.println(conta1.getSaldo());
        //System.out.println(conta2.getSaldo());
    }
}
