import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-09-04 8:39
 */
public class MyTest01 {
    public static void main(String[] args) {
        MyTest01 mytest = new MyTest01();
        int result = mytest.climbStairs(45);//1836311903
        System.out.println(result);
    }
    public int climbStairs1(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * @description:爬楼梯
     * @author: Hey
     * @date: 2022/9/6 21:19
     * @param: [n]
     * @return: int
     **/
    public int climbStairs(int n) {
        int numbers = 0;
        if(n==1) numbers = 1;
        if(n==2) numbers = 2;
        if(n>2){
            numbers = climbStairs(n-1)+climbStairs(n-2);
        }
        return numbers;
    }
    /**
     * @description:算术平方根解法一
     * @author: Hey
     * @date: 2022/9/6 9:39
     * @param: [x]
     * @return: int
     **/
    public int mySqrt1(int x) {
        int i = 0;
        while(true){
            if(i*i==x){
                break;
            }
            if(i*i<x&&(i+1)*(i+1)>x){
                break;
            }
            i++;
        }
        return i;
    }
    /**
     * @description:算术平方根
     * @author: Hey
     * @date: 2022/9/6 10:12
     * @param: [x]
     * @return: int
     *
     **/
    class Solution {
        public int mySqrt(int x) {
            int l = 0, r = x, ans = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long) mid * mid <= x) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return ans;
        }
    }


    /**
     * @description:二进制相加返回二进制结果
     * @author: Hey
     * @date: 2022/9/5 21:58
     * @param: [a, b]
     * @return: java.lang.String
     **/
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }


    /**
     * @description:十进制转二进制
     * @author: Hey
     * @date: 2022/9/5 21:35
     * @param: [a]
     * @return: java.lang.String
     **/
    public String toBinary(int a) {
        String result = "";//用字符串拼接
        while(a!=0) {//利用十进制转二进制除2法
            result=a%2+result;
            a=a/2;
        }
        return result;
    }
    /**
     * @description:二进制转十进制
     * @author: Hey
     * @date: 2022/9/5 13:00
     * @param: [a, b]
     * @return: java.lang.String
     * 有缺陷:int的范围为0-1023,如果String转为int超出这个范围，则会报错
     **/
    public String toDec(String a) {
        //将字符串类型转换为int
        int intArray = new Integer(a);
        int result = 0,p = 0;
        while(intArray!=0){
            int remainder = intArray%10;//取余数
            result+=(remainder * Math.pow(2,p));//核心思想。注：pow()返回的类型是double
            p++;//数位前移
            intArray = intArray/10;//截去末位
        }
        return result+"";
    }
    /**
     * @description:返回最后一个单词的长度
     * @author: Hey
     * @date: 2022/9/4 13:44
     * @param: [s]
     * @return: void
     **/
    public void lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * @description:
     * @author: Hey 
     * @date: 2022/9/4 19:16
     * @param: [digits]
     * @return: int[]
     **/
    public int[] plusOne(int[] digits) {
        String[] arr = new String[digits.length];

        for (int i = 0; i < digits.length; i++) {
            arr[i] = digits[i]+"";
        }

        arr[arr.length-1] = (digits[digits.length-1]+1)+"";
        List<String> newlist;
        if(arr[arr.length-1].equals("10")){
            arr[arr.length-1]="1";
            List<String> list = Arrays.asList(arr);
             newlist = new ArrayList<>(list);
            newlist.add("0");
            arr =  newlist.toArray(new String[]{});
        }
        int [] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = new Integer(arr[i]);
        }
        return arr1;


    }

    /**
     * @description:数组反转
     * @author: Hey
     * @date: 2022/9/5 10:17
     * @param: [Array]
     * @return: java.lang.String[]
     **/
    private static char[] reverseArray2(char[] Array) {
        char[] new_array = new char[Array.length];
        for (int i = 0; i < Array.length; i++) {
            // 反转后数组的第一个元素等于源数组的最后一个元素：
            new_array[i] = Array[Array.length - i - 1];
        }
        return new_array;
    }
    /**
     * @description:测试改动代码
     * @author: Hey
     * @date: 2022/9/16 14:50
     * @param:
     * @return:
     **/

}
/**

