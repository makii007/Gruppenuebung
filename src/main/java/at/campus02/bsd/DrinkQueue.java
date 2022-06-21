/**
 * DrinkQueue class
 * @author Ivana Lehki
 * @author Markus Neuhauser
 */

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;



public class DrinkQueue implements IQueue{

    public List<Object> elements = new ArrayList<Object>();

    private int maxSize = 5;

    public DrinkQueue(int maxsize) {
        maxSize = maxSize;
    }
    /**
     * add object to queue
     * @param obj
     * @return return true if adding works, otherwise false
     */
    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     *
     * @return first element
     * delete first element
     */
    @Override
    public Object poll() {
        Object element = peek();

        if (elements.size() != 0) {
            elements.remove(element);
        }
        return element;

    }

    /**
     *
     * @return first element
     * @exception throws NoSuchElementException if element doesn't exist
     */
    @Override
    public Object remove() {
        Object element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
        
    }

    /**
     * gives first element but does not delete, null if nothing there
     * @return element
     */
    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * like peek but NoSuchElementException instead of null
     * @return element
     */
    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
