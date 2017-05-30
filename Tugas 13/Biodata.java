
public class Biodata<T> {

  private T Type;

  public void add(T t) {
    this.Type = t;
  }

  public T get() {
    return Type;
  }
}