package chapter12_collection.test13;

import java.util.HashMap;
import java.util.Set;

/**
 * ClassName: Test13
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 20:46
 * @Version 1.0
 */
public class Test13 {
    public static void main(String[] args) {

        String str = "Your future depends on your dreams, so go to sleep.";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);

        HashMap map = new HashMap();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                int count = (int)map.get(arr[i]);
                map.put(arr[i],++count);
            }else {
                map.put(arr[i],1);
            }
        }

        Set entrySet = map.entrySet();
        for (Object o : entrySet){
            System.out.println(o);
        }

    }
}
