public class SumExpression extends Expression {
  private final Expression term1;
  private final Expression term2;

  SumExpression(Expression term1, Expression term2) {
    this.term1 = term1;
    this.term2 = term2;
  }

  public int getValue() {
    return term1.getValue() + term2.getValue();
  }

  public String format() {
    return String.format("(%s + %s)", term1.format(), term2.format());
  }
}
