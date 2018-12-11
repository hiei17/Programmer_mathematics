package 基础思想.Binary1;

/**
 * 十进制二进制互转
 * @Author: panda
 * @Date: 2018/12/11 0011 21:38
 */
import java.math.BigInteger;

public class Lesson1_1 {

    /**

     * @Description: 十进制转换成二进制
     * @param decimalSource 普通int
     * @return String
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource)); // 转换成 BigInteger 类型，默认是十进制
        return bi.toString(2); // 参数 2 指定的是转化成二进制
    }

    /**
     * @Description: 二进制转换成十进制
     * @param binarySource 二进制字符串
     * @return int
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);  // 转换为 BigInteger 类型，参数 2 指定的是二进制
        return Integer.parseInt(bi.toString());     // 默认转换成十进制
    }


    public static void main(String[] args) {

        int a = 53;
        System.out.println(String.format(" 数字 %d 的二进制是 %s", a, Lesson1_1.decimalToBinary(a))); // 获取十进制数 53 的二进制数

        String b = "110101";
        System.out.println(String.format(" 数字 %s 的十进制是 %d", b, Lesson1_1.binaryToDecimal(b))); // 获取二进制数 110101 的十进制数


        /*
         数字 53 的二进制是 110101
 数字 110101 的十进制是 53
        * */
    }


}
