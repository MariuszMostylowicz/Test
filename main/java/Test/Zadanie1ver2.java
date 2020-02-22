package Test;

import java.util.EmptyStackException;
import java.util.Stack;

public class Zadanie1ver2<T> implements Stos<T> {
    private int maxRozmiarStosu = 11;
    private  Object[] objects = new Object [maxRozmiarStosu];
    private int size = 0;



public void clear(){
        maxRozmiarStosu = 11;
        objects = new Object[maxRozmiarStosu];
        size = 0;
}
public boolean isEmpty(){
        return size == 0;

}
private void zwiększStos(){
        maxRozmiarStosu *= 2;
        Object [] nowyStos = new Object[maxRozmiarStosu];

        for (int i = 0; i < size; i++){
    nowyStos[i] = objects[i];
    }
        objects = nowyStos;
}
    public void push (T t) {
        if (size==maxRozmiarStosu){
            zwiększStos();
        }
        objects[size++] = t;
}
public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        T object = (T) objects[--size];
        return object;
}
public int size(){
        return  size;
}

}
