package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class IDrinkQueue implements IQueue{

    private List<Object> elements = new ArrayList<Object>();

    private int maxSize = 5;

    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
