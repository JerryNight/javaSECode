package chapter12_collection.test10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: Test10
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 20:01
 * @Version 1.0
 */
public class Test10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = input.next();
        char[] arr = s.toCharArray();
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        input.close();


    }
}
