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
        
        System.out.println("I want to see the RED or GREEN!!!");
    }
    //Mình muốn kết luận hàm mình ngon, mình phải test các trường hợp xài hàm
    //trường hợp 
    //mình phải thiết kế các test case, tình huống test để sau đó mình verify
    //giữa giá trị trả về của hàm(actual) có khớp với expected cái mình dự đoán hàm chạy phải trả về và nếu mọi thứ khớp, tức là actual==expected
    //mình mới dám gáy hàm ngon
    //
    //Cách này ổn, nhưng tiềm ẩn sai sót do nhìn == mắt nhiều case
    
    //Cách nâng cao
    // Cũng nhìn bằng mắt, nhưng chỉ nhìn 2 màu xanh đỏ cho mọi test case
    // có nghĩa: nếu bạn xài hàm với 100 tham số, chạy hàm 100 tình huống khác nhau
    //bạn chỉ cần nhìn duy nhất 2 màu xanh đỏ
    //xanh, code ổn cho mọi test case, mọi tình huống gọi hàm
    // đỏ, mọi case màu xanh, chỉ có ít nhất 1 thằng đỏ, kết luận cả đám đỏ
    // hàm đúng cho 99 trường hợp, expected=actual cho 99% tình huống
    // chỉ có 1 tình huống sai, ko khớp, kết luận luôn, hàm không ổn định
    // ai dám sài khi không ổn định, ổn định và chính xác cho mọi trường hợp
    //CHỈ CẦN ÍT NHẤT 1 CÁI KHÔNG ỔN, ĐỎ CẢ ĐÁM ĐỂ ĐẢM BẢO RẰNG HÀM 
}
