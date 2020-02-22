package Test;


    public interface Stos<T> {
        void clear();
        boolean isEmpty();
        void push(T t);
        T pop();
        int size();
    }

