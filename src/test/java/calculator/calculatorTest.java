package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    calculator calculator;

    @Before
    public void setup() {
        calculator = new calculator();
    }

    @Test
    public void add() {
        Assert.assertEquals(4, calculator.add(2, 2));
        Assert.assertEquals(6, calculator.add(4, 2));
        Assert.assertEquals(8, calculator.add(-4, 12));
    }

    @Test
    public void substract() {
        Assert.assertEquals(0, calculator.substract(2, 2));
        Assert.assertEquals(-6, calculator.substract(2, 8));
        Assert.assertEquals(8, calculator.substract(10, 2));
        Assert.assertEquals(-12, calculator.substract(-10, 2));

    }

    @Test
    public void multiply() {
        Assert.assertEquals(4, calculator.multiply(2, 2));
        Assert.assertEquals(4, calculator.multiply(-2, -2));
        Assert.assertEquals(-16, calculator.multiply(2, -8));
        Assert.assertEquals(20, calculator.multiply(10, 2));
    }

    @Test
    public void divide() {
    }
}