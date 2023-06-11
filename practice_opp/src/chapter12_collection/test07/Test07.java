package chapter12_collection.test07;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName: Test07
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 18:48
 * @Version 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("生成随机字符：");
        ArrayList<Character> aChar = getChar();
        System.out.println(aChar);
        System.out.println("A:"+listTest(aChar,"A"));
        System.out.println("B:"+listTest(aChar,"B"));
        System.out.println("D:"+listTest(aChar,"D"));
        System.out.println("E:"+listTest(aChar,"E"));

    }
    public static ArrayList<Character> getChar(){
        ArrayList<Character> chars = new ArrayList<Character>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char s = (char)(random.nextInt(26)+65);
            chars.add(s);

        }
        return chars;
    }

    public static int listTest(ArrayList<Character> list, String x){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (x.equals( list.get(i).toString())){
                count++;
            }
        }
        return count;
    }
}
