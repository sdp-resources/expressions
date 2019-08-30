public class IntegerExpression extends Expression {
  private int integer;

  IntegerExpression(int integer) {
    this.integer = integer;
  }

  public int getValue() {
    return integer;
  }

  public String format() {
    return String.valueOf(integer);
  }
}
