/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mathutil.core;

import static com.fpt.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author USUS
 */

//Ta sẽ dùng kĩ thuật Data Driven Testing/Parametered Testing
//Tham số hóa bộ dữ liệu test
//Là kĩ thuật tách bộ dữ liệu test ra hẳn câu lệnh kiểm thử hàm

//Xét cho bài getF()
//bộ data,đặt ở txt,Excel,table/db
//0 -> 1
//1 -> 1
//2 -> 2
//3 -> 6
//4 -> 24
//5 -> 120

//nhồi/fill bộ data này vào trong lời gọi hàm getF() + assertEqual
//tách bạch data và lời gọi hàm check kq
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    //chuẩn bị bộ data trước ở txt,excel,database
   //Nếu để file ngoài,thì phải viết thêm code đọc data
   @Parameters
   public static Object[][] initData(){
       return new Integer[][]{ 
                                
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                            }; 
   }
   
   @Parameter(value = 0)
   public int n; //Bạn muốn tính mấy giai thừa
    
   @Parameter(value = 1)
   public long expected; //Bạn kì vọng giai thừa trả về mấy

   @Test
   public void checkFactorialGivenRightArgumentReturnsWell(){
       assertEquals(expected, getFactorial(n));
   }
}
