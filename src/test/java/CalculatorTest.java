import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void Add(){
        assertEquals(10, calculator.Add(4,6));
    }

    @Test
    public void Subtract(){
        assertEquals(2, calculator.Subtract(6,4));
    }

    @Test
    public void Multiply(){
        assertEquals(15, calculator.Multiply(3,5));
    }

    @Test
    public void Divide(){
        assertEquals(5, calculator.Divide(15,3), 0.01);
    }
}
