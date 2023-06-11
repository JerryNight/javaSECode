package chapter12_collection.test04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test04
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 12:11
 * @Version 1.0
 */
public class Test04 {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        HashSet set = new HashSet();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(50));
        }
        System.out.println("乐透号码已经生成，游戏开始：");
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"个数字[1~50]：");
            int s = input.nextInt();
            list1.add(s);
            if (list.contains(s)){
                set.add(s);
            }
        }
        input.close();

        System.out.println("你输入的号码为："+list1);
        System.out.println("乐透号码为："+list);
        System.out.println("你猜中了："+set.size()+"个,数字是："+set);

    }
}
