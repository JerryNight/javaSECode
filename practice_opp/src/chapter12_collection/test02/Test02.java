package chapter12_collection.test02;

import java.util.ArrayList;

/**
 * ClassName: Test02
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 8:50
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] hua = {"黑桃","红桃","方片","梅花"};
        String[] wang = {"大王","小王"};

        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++) {
                list.add(hua[i] + dian[j]);
            }
        }
        for (int i = 0; i < wang.length; i++) {
            list.add(wang[i]);
        }

        for (String s : list){
            System.out.println(s);
        }

        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        ArrayList<String> list3 = new ArrayList();
        ArrayList<String> list4 = new ArrayList();
        for (int i = 0; i < 11; i++) {
            int s = (int) (Math.random() * list.size());
            list1.add(list.remove(s));
        }
        for (int i = 0; i < 11; i++) {
            int s = (int) (Math.random() * list.size());
            list2.add(list.remove(s));
        }
        for (int i = 0; i < 11; i++) {
            int s = (int) (Math.random() * list.size());
            list3.add(list.remove(s));
        }
        for (int i = 0; i < 11; i++) {
            int s = (int) (Math.random() * list.size());
            list4.add(list.remove(s));
        }
        System.out.println("第1个人：" + list1);
        System.out.println("第2个人：" + list2);
        System.out.println("第3个人：" + list3);
        System.out.println("第4个人：" + list4);
        System.out.println("剩余：" + list);

    }
}
