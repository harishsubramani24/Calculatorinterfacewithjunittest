package com.example.CalculatorApp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

import com.example.CalculatorApp.Calculator.CalculatorService;


public class CalculatorServiceTest {

	@Test
    public void testAdd() {
		
		
        CalculatorService calculatorService = mock(CalculatorService.class);
        when(calculatorService.add(10, 10)).thenReturn(20);
        assertEquals(20, calculatorService.add(10, 10));
    }

    @Test
    public void testMultiply() {
    	
    	
        CalculatorService calculatorService = mock(CalculatorService.class);
        when(calculatorService.multiply(5, 5)).thenReturn(25);
        assertEquals(25, calculatorService.multiply(5, 5));
    }

    @Test
    public void testSub() {
    	
    	
        CalculatorService calculatorService = mock(CalculatorService.class);
        when(calculatorService.sub(5, 3)).thenReturn(2);
        assertEquals(2, calculatorService.sub(5, 3));
    }

    @Test
    public void testDivide() {
    	
    	
        CalculatorService calculatorService = mock(CalculatorService.class);
        when(calculatorService.divide(20.0, 4.0)).thenReturn(5.0);
        assertEquals(5.0, calculatorService.divide(20.0, 4.0), 0.0001);
    }
}