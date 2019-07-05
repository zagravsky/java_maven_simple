import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello(){
        Assert.assertEquals("hello", Hello.hello());
    }

    @Test
    public void testHelloAge(){
        Assert.assertEquals("Hello, 6!", Hello.helloAge(6));
        Assert.assertEquals("Hello, 20!", Hello.helloAge(20));
        Assert.assertEquals("Hello, 100!", Hello.helloAge(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeZero(){
        Hello.helloAge(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeNegative(){
        Hello.helloAge(-10);
    }
}
