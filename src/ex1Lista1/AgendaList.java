package ex1Lista1;

import java.util.ArrayList;

public class AgendaList<E> extends ArrayList<E> {

    public boolean add(E e){
        if(this.size()<10) {
            super.add(e);
            return true;
        }else{
            return false;

        }
    }
}
