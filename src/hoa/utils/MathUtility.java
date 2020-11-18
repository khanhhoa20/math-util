/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoa.utils;

/**
 *
 * @author PC
 */
public class MathUtility {

    //lam bo thu vien fake nhung giong y chang Math
    //Math.PI, .abs(), .sqrt(), .pow(a,b) a^b
    //phàm là thư viện thì sẽ xài static khi không cần lưu info cho riêng mình
    // còn thư viện mà cần lưu info riêng thì vẫn non-static như bth
    public static final double PI = 3.1415;

    //tiện ích tính giai thừa n!=1.2.3...n
    /*
    n phai tu 0 trở lên 
    0!=1!=1
    âm giai thừa vô nghĩa
    giai thừa tăng cực nhanh, 21! long không chứa đc
    bài này chăn giai thừa từ 0-20
    
     */
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0...20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        /*
//        đứa nào viết else ở đây trừ điểm
//        mặc nhiên CPU đến đc đây là hiểu rằng n=2...20
//         */
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;

//    }
   //viet ham de quy cho pro 
public static long getFactorial(int n){
    if(n<0||n>20){
    throw new IllegalArgumentException("n must be between 0...20");
       }
    if(n == 0 || n == 1) {
            return 1;//để dùng
        }
    return n*getFactorial(n-1);//đệ quy đó
    //gọi lại chính hàm của mình với quy mô khác, n-1
    //đi mãi về 1
    

}
}
//5!=5*4!,...2!=2*1!, 1!=1
//đệ quy là gọi lại mình với quy mô nhỏ hơn
//kết luận n!=n*(n-1)!
// phải có dừng, ko thì lặp vô tận

