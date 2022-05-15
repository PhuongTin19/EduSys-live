package com.fpt.mathutil.core;

import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test; //JUnit 4




public class FactorialTest {
    
   @Test 
   public void checkFactorialGivenRightArgumentReturnsWell(){
       long expected = 120;
       long actual=MathUtil.getFactorial(5);
       
       Assert.assertEquals(expected, actual);
       
       Assert.assertEquals(720, MathUtil.getFactorial(6));
       Assert.assertEquals(1, MathUtil.getFactorial(0));
       
       // Assert.assertEquals(25,MathUtil.getBinhPhuong(5));
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void checkFactorialGivenWrongArgumentThrowsException(){
       MathUtil.getFactorial(-5); 
	  //assertThrows(IllegalArgumentException.class,"ngu");
   }
  }
