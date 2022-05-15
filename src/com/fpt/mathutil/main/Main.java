
package com.fpt.mathutil.main;

import com.fpt.mathutil.core.MathUtil;

public class Main {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        
        System.out.println("6! = 120; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
    
        //Thêm code sau khi để lên git
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
    }
}
