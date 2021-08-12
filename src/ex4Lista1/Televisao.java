package ex4Lista1;

public class Televisao {
    private int canal = 1;
    private int volume = 1;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return  "Canal atual = " + this.canal +
                ", volume atual = " + this.volume;
    }
}
