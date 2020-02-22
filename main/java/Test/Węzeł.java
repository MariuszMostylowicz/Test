package Test;

import java.util.LinkedList;

public class Węzeł <T> {
    private T zawartość;
    private Węzeł<T> rodzic;
    private LinkedList<Węzeł<T>> dziecko;

    public T getZawartość() {
        return zawartość;
    }

    public Węzeł() {
        rodzic = null;
        dziecko = new LinkedList<Węzeł<T>>();
    }

    public Węzeł(Węzeł<T> rodzic) {
        this();
        this.rodzic = rodzic;
    }

    public Węzeł(Węzeł<T> rodzic, T zawartość) {
        this(rodzic);
        this.zawartość = zawartość;
    }

    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }

    public Węzeł<T> getRodzic() {
        return rodzic;
    }

    public void setRodzic(Węzeł<T> rodzic) {
        this.rodzic = rodzic;
    }

    public LinkedList<Węzeł<T>> getDziecko() {
        return dziecko;
    }

    public void setDziecko(LinkedList<Węzeł<T>> dziecko) {
        this.dziecko = dziecko;
    }

    public int getRozmiar() {
        return dziecko.size();
    }

    public boolean czyLiść() {
        return dziecko.isEmpty();
    }
///// Zadanie 3 /////
    public int ileLiści() {
        int count = 0;
        if (dziecko.isEmpty()) {
            count++;

        }
        return count;
    }

    //// ZADANIE 7 /////
    public Węzeł<T> czySymetryczne() {
        if (rodzic != null) {
            LinkedList<Węzeł<T>> dzieciRodzica = rodzic.getDziecko();

            int pos = dzieciRodzica.indexOf(this);

            if (pos < (dzieciRodzica.size() - 1))

                return dzieciRodzica.get(pos + 1);
        }

        return null;
    }
}