package ex4Lista1;

public class TelevisaoTest {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        Televisao televisao = controleRemoto.ligarTelevisao();

        controleRemoto.consultaVolumeCanal(televisao);
        controleRemoto.aumentaCanal(televisao);
        controleRemoto.consultaVolumeCanal(televisao);
        controleRemoto.aumentaVolume(televisao);
        controleRemoto.consultaVolumeCanal(televisao);
        controleRemoto.diminuiCanal(televisao);
        controleRemoto.diminuiVolume(televisao);

    }
}
