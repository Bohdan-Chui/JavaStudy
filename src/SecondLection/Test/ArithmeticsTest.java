package SecondLection.Test;

import SecondLection.Calculation.Arithmetics;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class ArithmeticsTest {

    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public  final Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT(){
        a = new Arithmetics();
    }

    @Test
    public void add() {
        double res = a.add(3,7);
        Assert.assertEquals(res, 10,0);

    }

    @Test
    public void deduct() {
        double res = a.deduct(3,7);
        Assert.assertEquals(res, -4,0);
    }

    @Test
    public void mult() {
        double res = a.mult(3,7);
        Assert.assertEquals(res, 21,0);
    }

    @Ignore
    @Test
    public void div() {
        double res = a.div(10,5);
        Assert.assertEquals(res, 2,0);
    }

    //@Test(expected = ArithmeticException.class)
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(1.0, 0.0);
    }

    @Ignore
    @Test
    public void TestN(){
        while(true){

        }
    }
}