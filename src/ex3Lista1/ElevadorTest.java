package ex3Lista1;

public class ElevadorTest {
    public static void main(String[] args) {
        ElevadorService service = new ElevadorService();
        Elevador elevador = service.inicicilizaElevador(5,4);

        service.entraUmaPessoa(elevador);
        service.entraUmaPessoa(elevador);
        service.entraUmaPessoa(elevador);
        service.entraUmaPessoa(elevador);

        service.sobe(elevador);
        service.sobe(elevador);
        service.sobe(elevador);
        service.sobe(elevador);




        System.out.println(elevador.getPessoasPresentes());
        System.out.println(elevador.getAndarAtual());
    }
}
