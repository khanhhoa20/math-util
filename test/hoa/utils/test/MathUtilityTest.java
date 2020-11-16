/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoa.utils.test;

import static hoa.utils.MathUtility.*;
//chỉ có từ jdk 5?, hàm static gọi mà khong cần tên class chấm
// do mình đã chơi trò khái báo sẵn tên class và tên hàm static qua lệnh
//import static
//sau này xài hàm static của class này không cần tên class chấm xài như C
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
    //viết ra những tình huống xài hàm getFactorial()
    //kiểm tra xem actual==expected hay không như truyền thống bên main()
    //nhưng ở đây xịn sò hơn, show ra màu xanh đỏ
    // ngoài ra nó còn dùng cho việc CI- Continuous Integration
    //                               CD - Continuous Delivery
    //                               CT - Continuous Regression Test
    //                               DevOps - Development & Operation
    //ngoài doanh nghiệp đang xài
    //app liên tục đc kiểm tra chất lượng code, build ra file .jar .war
    //đẩy lên 1 server trung gian- STAGING ENVIRONMENT để cho nhóm test sẵn sàng test kĩ
    //sau đó có thể đẩy thẳng lên PRODUCTION SERVER, MÁY CHẠY THẬT Ở NƠI KHÁC
    //mọi việc sẽ bắt đầu kể từ lúc developer đẩy code lên github
    //mọi thứ có thể tự động không cần con người can thiệp
    
    @Test //từ khóa này -- biến cái hàm này thành public static void main()
    //trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của expected vs actual qua hàm 
    //assertEquals()...mà thư viện cung cấp
    //assert...() đủ các loại assert trên cuộc đời-- assert(v): so sánh
    //thay vì so sánh bằng mắt, ta nhờ hàm so sánh giùm, thảy về màu giùm ta
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        assertEquals(0, getFactorial(0));
        //hãy tính giùm tui 5! coi nó có là 120 không
        //có thì báo xanh không thì báo đỏ
        
    }
    
    
}
