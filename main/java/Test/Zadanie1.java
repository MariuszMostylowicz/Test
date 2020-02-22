package Test;

public class Zadanie1<T> {
    private WęzełZad1<T> pierwszyWęzeł;
    private WęzełZad1<T> ostatniWęzeł;
    private int count;

    public void dodajPierwszy(T element){
    WęzełZad1<T> węzeł = new WęzełZad1<>(element,null,null);
    if(pierwszyWęzeł == null) {
        this.pierwszyWęzeł = węzeł;
        this.ostatniWęzeł = węzeł;
    }else{
        węzeł.setNastępnyWęzeł(pierwszyWęzeł);
        pierwszyWęzeł.setPoprzedniWęzeł(węzeł);
        pierwszyWęzeł = węzeł;

    }
    count++;
    }
    public void dodajOstatni(T element){
        WęzełZad1<T> węzeł = new WęzełZad1<>(element,null,null);
        if (pierwszyWęzeł == null){
            this.pierwszyWęzeł = węzeł;
            this.ostatniWęzeł = węzeł;
        }else{
            ostatniWęzeł.setNastępnyWęzeł(węzeł);
            węzeł.setPoprzedniWęzeł(ostatniWęzeł);
            ostatniWęzeł = węzeł;
        }
        count++;
    }
    public T usuńOstatni(){
        if (count == 0){
            throw new IndexOutOfBoundsException();
        }else if (count == 1){
            WęzełZad1<T> węzeł = this.pierwszyWęzeł;
            pierwszyWęzeł = null;
            ostatniWęzeł = null;
            count--;
            return węzeł.getZawartość();
        } else {
            WęzełZad1<T> węzeł = this.ostatniWęzeł;
            WęzełZad1<T> poprzedni = węzeł.getPoprzedniWęzeł();
            poprzedni.setNastępnyWęzeł(null);
            this.ostatniWęzeł = poprzedni;
            count--;
            return węzeł.getZawartość();
        }
    }
    void reverse() {
        for (int i = 0; i < pierwszyWęzeł / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[pierwszyWęzeł - 1 - i];
            tab[pierwszyWęzeł - 1 - i] = temp;

        }
}
