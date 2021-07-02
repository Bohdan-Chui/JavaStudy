package SecondLection.JavaPlay;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    public static final int COUNTER = 10_000;
    private static Model model;

    @BeforeClass
    public static void runT(){
        model = new Model();
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);


    }

    @Test
    public void testSetMinBarrier(){
        Assert.assertEquals(model.getMinBarrier(),GlobalConstants.PRIMARY_MIN_BARRIER);
    }

    @Test
    public void testSetMaxBarrier(){
        Assert.assertTrue(model.getMaxBarrier()==GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    @Test
    public void testSetSecretValue() {
        boolean flag = true;
       for (int i =0; i < COUNTER; i++){
           model.setSecretValue();
           if (GlobalConstants.PRIMARY_MIN_BARRIER >= model.getSecretValue() || GlobalConstants.PRIMARY_MAX_BARRIER <= model.getSecretValue()){
               flag = false;
           }
       }
       Assert.assertTrue(flag);
    }

    @Test
    public void testCheckValue() {
        model.setSecretValue();
        Assert.assertFalse(model.checkValue(model.getSecretValue()));
    }
}