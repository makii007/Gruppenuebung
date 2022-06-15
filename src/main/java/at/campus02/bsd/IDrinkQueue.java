package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class IDrinkQueue implements IQueue{

    private List<Object> elements = new ArrayList<Object>();

    private int maxSize = 5;

    @Override
    public boolean offer(Object obj) {
        return false;
    }

    @Override
    public Object poll() {
        Object element = peek();

        if (elements.size() != 0) {
            elements.remove(element);
        }
        return element;

    }

    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
        
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
}
