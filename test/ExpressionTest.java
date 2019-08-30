import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTest {
  @Test
  public void integerExpressions() {
    Expression one = new IntegerExpression(1);
    assertEquals(1, one.getValue());
    assertEquals("1", one.format());
  }

  @Test
  public void sumExpressions() {
    Expression one = new IntegerExpression(1);
    Expression two = new IntegerExpression(2);
    Expression sum = new SumExpression(one, two);
    assertEquals(3, sum.getValue());
    assertEquals("(1 + 2)", sum.format());
    Expression biggerSum = new SumExpression(sum, new IntegerExpression(3));
    assertEquals(6, biggerSum.getValue());
    assertEquals("((1 + 2) + 3)", biggerSum.format());
  }
}