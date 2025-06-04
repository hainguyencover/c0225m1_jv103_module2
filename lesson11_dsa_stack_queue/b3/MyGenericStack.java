package b3;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyGenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public MyGenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public ArrayList<T> get() {
        return stack;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
