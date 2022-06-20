/**
 * StringQueue class
 * @author Ivana Lehki
 * @author Markus Neuhauser
 */

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  public List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
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
      elements.add(obj.toString());
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
  public String poll() {
    String element = peek();

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
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
  /**
   * gives first element but does not delete, null if nothing there
   * @return element
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  /**
   * like peek but NoSuchElementException instead of null
   * @return
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
}