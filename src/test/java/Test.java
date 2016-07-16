import org.junit.Assert;

public class  Test{
    @org.junit.Test
    public void test_1_1(){
        Add add = new Add();
        Assert.assertEquals(add.add(1,1),2);
    }
}