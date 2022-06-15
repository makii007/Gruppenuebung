package at.campus02.bsd;

public interface IDrinksQueue {
    /*
  add object to queue, return true if works, otherwise false
  */
    public abstract boolean offer(Drink drink);

    /*
    returns and deletes first element; null if no element in there
     */
    public abstract Drink poll();

    /*
    like poll but if no elment exists NoSuchElementException is throwin instead of null return value
     */
    public abstract Drink remove();

    /*
    gives first element but does not delete, null if nothing there
     */
    public abstract Drink peek();

    /*
    like peek but NoSuchElementException instead of null
     */
    public abstract Drink element();
}
