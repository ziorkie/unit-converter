package app;



import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void numericVerifier() {

        Assert.assertTrue(Converter.numericVerifier("1"));
        Assert.assertTrue(Converter.numericVerifier("1.63"));
        Assert.assertTrue(!Converter.numericVerifier("-8"));
        Assert.assertTrue(!Converter.numericVerifier("H"));
        Assert.assertTrue(!Converter.numericVerifier("-9.421"));
    }

    @org.junit.Test
    public void mConvert() {
        Unit unit = new Unit("m1", 1);
        Tuple tuple= new Tuple(1, 2.54, 30.48);
        Assert.assertSame(Converter.mConvert(unit), tuple);


    }

    @org.junit.Test
    public void wConvert() {
        Unit unit = new Unit("w1", 1);
        Tuple tuple= new Tuple(1, 0.035273961980686726, 0.002204622621848776);
        Assert.assertSame(Converter.mConvert(unit), tuple);

    }

    @org.junit.Test
    public void vConvert() {
        Unit unit = new Unit("v1", 1);
        Tuple tuple= new Tuple(1, 0.6213712, 0.5399568);
        Assert.assertSame(Converter.mConvert(unit), tuple);

    }
}
