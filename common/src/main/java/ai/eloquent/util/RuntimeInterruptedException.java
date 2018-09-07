package ai.eloquent.util;

/**
 * An unchecked version of {@link java.lang.InterruptedException}. Thrown by
 * classes that pay attention to if they were interrupted, such as the LexicalizedParser.
 */
public class RuntimeInterruptedException extends RuntimeException {
  public RuntimeInterruptedException() {
    super();
  }

  public RuntimeInterruptedException(InterruptedException e) {
    super(e);
  }
}
