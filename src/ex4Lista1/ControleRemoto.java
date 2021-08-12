package ex4Lista1;

public class ControleRemoto {

    public Televisao ligarTelevisao() {
        return new Televisao();
    }

    public void aumentaCanal(Televisao televisao){
        if(televisao.getCanal()<999) {
            televisao.setCanal(televisao.getCanal() + 1);
        }else{
            televisao.setCanal(1);
        }
    }

    public void diminuiCanal(Televisao televisao){
        if(televisao.getCanal()>1){
            televisao.setCanal(televisao.getCanal()-1);
        }else{
            televisao.setCanal(999);
        }

    }

    public void aumentaVolume(Televisao televisao){
        if(televisao.getVolume()<99){
            televisao.setVolume(televisao.getVolume()+1);
        }
    }

    public void diminuiVolume(Televisao televisao){
        if(televisao.getVolume()>1){
            televisao.setVolume(televisao.getVolume()-1);
        }
    }

    public void escolheQualquerCanal(Televisao televisao,int canalEscolhido){
        if(canalEscolhido>=1 && canalEscolhido<=999){
            televisao.setCanal(canalEscolhido);
        }
    }

    public void consultaVolumeCanal(Televisao televisao){
        System.out.println(televisao.toString());
    }

}
