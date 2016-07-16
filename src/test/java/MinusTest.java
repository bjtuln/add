import org.junit.Assert;
import org.junit.Test;

/**
 * Created by twer on 7/16/16.
 */
public class MinusTest {
    @Test
    public void should_return_1_when_2_minus_1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.minus(2, 1));
    }
}
