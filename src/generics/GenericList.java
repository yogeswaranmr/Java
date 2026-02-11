package generics;


public class GenericList<T> {
    T[] items = (T[]) new Object[10];
    int count = 0;

    public void add(T val){
        items[count++] = val;
    }

    public T get(int idx){
        return items[idx];
    }
}

