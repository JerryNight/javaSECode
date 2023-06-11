package chapter12_collection.test05;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName: Test05
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 12:53
 * @Version 1.0
 */
public class Test05 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(101));
        }
        System.out.println("10个随机值："+list);
        ArrayList top3 = getTop3(list);
        System.out.println("top3:" + top3);
        System.out.println(list);

    }
    public static ArrayList getTop3(ArrayList list){
        ArrayList list1 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Integer max = (Integer) list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (max < (Integer) list.get(j)){
                    max = (Integer) list.get(j);
                }
            }
            list1.add(max);
            list.remove(max);
        }
        return list1;
    }
}
