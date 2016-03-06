package org.sourceit;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HomeTaskTest1 {

    /**
     * Tests on isEven method
     */
    @Test
    public void testIsEvenOnOdd() {
        Assert.assertEquals(HomeTask1.isEven(10001), false);
    }

    @Test
    public void testIsEvenOnEven() {
        Assert.assertEquals(HomeTask1.isEven(10000), true);
    }

    /**
     * Tests on findHypotenuse method
     */
    @Test
    public void testFindHypotenuse() {
        Assert.assertEquals(HomeTask1.findHypotenuse(4, 3), 5D);
    }

    @Test
    public void testFindHypotenuseNegativeA() {
        Assert.assertEquals(HomeTask1.findHypotenuse(-1, 4), 0D);
    }

    @Test
    public void testFindHypotenuseNegativeB() {
        Assert.assertEquals(HomeTask1.findHypotenuse(4, -1), 0D);
    }

    /**
     * Test on perimeter method
     */
    @Test
    public void testPerimeter() {
        Assert.assertEquals(HomeTask1.perimeter(4, 3, 5), 12D);
    }

    /**
     * Tests on area method
     */
    @Test
    public void testAreaNegativeA() {
        Assert.assertEquals(HomeTask1.area(-1, 3), 0D);
    }

    @Test
    public void testAreaNegativeB() {
        Assert.assertEquals(HomeTask1.area(3, -1), 0D);
    }

    @Test
    public void testArea() {
        Assert.assertEquals(Math.round(HomeTask1.area(4, 3)), 6);
    }

    /**
     * Tests on generateNumberFromRange
     */
    @Test
    public void testGenerateNumberFromRange() {
        for (int i = 0; i < 100; i++) {
            int generatedNumber = HomeTask1.generateNumberFromRange(-100, 100);
            boolean isInRange = generatedNumber >= -100 && generatedNumber <= 100;
            Assert.assertEquals(isInRange, true);
        }
    }

    @Test
    public void testGenerateNumberFromRange2() {
        for (int i = 0; i < 100; i++) {
            int generatedNumber = HomeTask1.generateNumberFromRange(-i, i);
            boolean isInRange = generatedNumber >= -i && generatedNumber <= i;
            Assert.assertEquals(isInRange, true);
        }
    }

    /**
     * Tests on calculateSum method
     */
    @Test
    public void testCalculateSumBasic() {
        Assert.assertEquals(HomeTask1.calculateSum(1234L), 10L);
    }

    @Test
    public void testCalculateSumZero() {
        Assert.assertEquals(HomeTask1.calculateSum(0L), 0L);
    }

    @Test
    public void testCalculateSumNegative() {
        Assert.assertEquals(HomeTask1.calculateSum(-1234L), 10L);
    }

    /**
     * Tests on fibonacci method
     */
    @Test
    public void testFibonacci() {
        Assert.assertEquals(HomeTask1.fibonacci(2), 2);
    }

    @Test
    public void testFibonacciNegativeTill() {
        Assert.assertEquals(HomeTask1.fibonacci(-2), 1);
    }

    @Test
    public void testFibonacciBasic() {
        Assert.assertEquals(HomeTask1.fibonacci(6), 13);
    }

    /**
     * Tests on isHappy method
     */
    @Test
    public void testHappyTicket() {
        Assert.assertEquals(HomeTask1.isHappy(-2), false);
    }

    @Test
    public void testHappyTicketBasic() {
        Assert.assertEquals(HomeTask1.isHappy(10001), true);
    }

}
