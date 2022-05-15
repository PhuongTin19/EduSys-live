 package com.fpt.mathutil.core;


public class MathUtil {
    //Viết hàm toán học tính giai thừa n!=1.2.3...n
    //Quy ước: 0! = 1! = 1
    //ko tính giai thừa số âm
    //20! là vừa khớp kiểu long,kiểu long tối đa 18 số 0
    //21! tràn kiểu long,long: 18 số 0
    //tóm lại:hàm tính giai thừa của n =0...20
   
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. must be between 0..20");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        long product = 1;
        
        for (int i = 2; i <= n; i++){
            product *= i;
        }
        
        return n * getFactorial(n-1);
    }
    
}
