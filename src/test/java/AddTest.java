import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    @Test
    public void test_1_1(){
        Add add = new Add();
        Assert.assertEquals(add.add(1,1),2);
    }
}