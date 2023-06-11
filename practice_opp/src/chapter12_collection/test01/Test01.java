package chapter12_collection.test01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName: Test01
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 8:26
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        char arr[] = new char[26 + 26 + 10];
        for (int i = 0; i < arr.length; i++) {
            if (i < 10){
                arr[i] = (char) (i+48);
            } else if (i < 10 + 26) {
                arr[i] = (char) (i+65-10);
            } else if (i < 10 + 26 + 26) {
                arr[i] = (char) (i+97-10-26);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = "";
            for (int j = 0; j < 6; j++) {
                s += arr[(int)(Math.random() * 62)];
            }
            list.add(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
