package chapter12_collection.test17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ClassName: Test17
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 21:16
 * @Version 1.0
 */
public class Test17 {
    public static void main(String[] args) {
        String[] nums = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        String[] colors = { "方片", "梅花", "红桃", "黑桃" };

        HashMap map = new HashMap();
        ArrayList list = new ArrayList();
        int index = 1;
        for (String num : nums){
            for (String color : colors){
                map.put(index,color.concat(num));
                list.add(index);
                index++;
            }
        }
        map.put(index, "小王");
        list.add(index);
        index++;
        map.put(index, "大王");
        list.add(index);

        //洗牌
        Collections.shuffle(list);
        TreeSet left = new TreeSet();
        TreeSet right = new TreeSet();
        TreeSet me = new TreeSet();
        TreeSet up = new TreeSet();
        TreeSet lastCards = new TreeSet();
        for (int i = 0; i < 13; i++) {
            left.add(list.remove(0));
            right.add(list.remove(0));
            up.add(list.remove(0));
            me.add(list.remove(0));
        }
        lastCards.addAll(list);

        //看牌
        for (Object o : left){
            System.out.print(map.get(o)+" ");
        }

    }
}
