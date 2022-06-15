package at.campus02.bsd;

// fastly written (not really nice) comments but good enough to understand
public interface IQueue {
  /* 
  add object to queue, return true if works, otherwise false
  */
  public abstract boolean offer(Object obj);

  /* 
  returns and deletes first element; null if no element in there
   */
  public abstract Object poll();

  /* 
  like poll but if no elment exists NoSuchElementException is throwin instead of null return value
   */
  public abstract Object remove();

  /* 
  gives first element but does not delete, null if nothing there
   */
  public abstract Object peek();

  /*
  like peek but NoSuchElementException instead of null
   */
  public abstract Object element();
}