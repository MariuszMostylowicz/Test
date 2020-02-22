package Test;

public class WęzełZad1 <T>{
    private T zawartość;
    private WęzełZad1<T> poprzedniWęzeł;
    private WęzełZad1<T> następnyWęzeł;

    public T getZawartość() {
        return zawartość;
    }

    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }

    public WęzełZad1<T> getPoprzedniWęzeł() {
        return poprzedniWęzeł;
    }

    public void setPoprzedniWęzeł(WęzełZad1<T> poprzedniWęzeł) {
        this.poprzedniWęzeł = poprzedniWęzeł;
    }

    public WęzełZad1<T> getNastępnyWęzeł() {
        return następnyWęzeł;
    }

    public void setNastępnyWęzeł(WęzełZad1<T> następnyWęzeł) {
        this.następnyWęzeł = następnyWęzeł;
    }

    public WęzełZad1(T zawartość, WęzełZad1<T> poprzedniWęzeł, WęzełZad1<T> następnyWęzeł) {
        this.zawartość = zawartość;
        this.poprzedniWęzeł = poprzedniWęzeł;
        this.następnyWęzeł = następnyWęzeł;
    }


}
