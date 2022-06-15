package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

public class IDrinkQueue implements IQueue{

    private List<Object> elements = new ArrayList<Object>();

    private int maxSize = 5;

    @Override
    public boolean offer(Object obj) {
        return false;
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
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
}
