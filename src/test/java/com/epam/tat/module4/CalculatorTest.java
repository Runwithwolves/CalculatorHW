package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeClass
    public void startCalculator(){
        System.out.println("All Testing Statuses are below");
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {
    long resultsum = calculator.sum(15, 17);
    Assert.assertEquals(resultsum, 32, "Sum is somehow incorrect");
    }
    @Test
    public void doublesumTest() {
        double resultdoublesum = calculator.sum(15, 15);
        Assert.assertEquals(resultdoublesum, 30, "Double Sum is incorrect");
    }
    @Test
    public void squarerootTest() {
        double squarerootresult = calculator.sqrt(9);
        Assert.assertEquals(squarerootresult, 3, "Square Root is incorrect");
    }
    @Test
    public void minusTest() {
        long resultminus = calculator.sub(50,20);
        Assert.assertEquals(resultminus, 30 , "Minus Test went wrong");
    }
    @Test
    public void minusdoubleTest() {
        long resultdoubleminus = calculator.sub(30, 15);
        Assert.assertEquals(resultdoubleminus, 15, "Something went wrong with numbers");
    }
    @Test
    public void multiplyTest() {
        long resultmultiply = calculator.mult(25, 3);
        Assert.assertEquals(resultmultiply, 75, "Multiplying error has been made");
    }
    @Test
    public void multiplydoubleTest() {
        double resultdoublemultiply = calculator.mult(15, 3);
        Assert.assertEquals(resultdoublemultiply, 45, "Error processing multiply test" );
    }
    @Test
    public void divideTest() {
        long resultdivision = calculator.div(12, 3);
        Assert.assertEquals(resultdivision, 4, "Error during division process");
    }
    @Test public void divideTest2() {
        double resultdoubledivision = calculator.div(5, 0);
        Assert.assertEquals(resultdoubledivision, 1, "Something went wrong with division");
    }
    @Test public void powTest() {
        double resultpow = calculator.pow(10, 3);
        Assert.assertEquals(resultpow, 999 , "Power is incorrect" );
    }
}
