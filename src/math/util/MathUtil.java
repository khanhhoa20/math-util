/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import hoa.utils.MathUtility;

/**
 *
 * @author PC
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long expected = 120;//tows hi vongj 120 neeus tows goij 5!
        long actual = MathUtility.getFactorial(5);
        //in ra kiểm tra giữa cái ta muốn và cái ta làm
        System.out.println("5! expected : " + expected);
        System.out.println("5! actual : " + actual);

        //tiếp tục cho các tình huống khác 6!, 7!, 21!, -5!,  0!...
        //                      các tình huống cấn phải test ta gọi là test cases
        //về lí thuyết ta phải test hết các tình huống....
        //về thực hành: kì 5 sẽ rõ SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //tao kì vọng mày ném về ngoại lệ, phải là ngoại lệ
        //IllegalArgumentException nếu tao cố tình, người xài hàm này của tao đưa tham số âm, tham số >20
        System.out.println("expected: IllegalArgumentException" + MathUtility.getFactorial(-5));
    }
    
}
