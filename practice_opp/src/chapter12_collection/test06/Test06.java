package chapter12_collection.test06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test06
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 18:24
 * @Version 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println("随机数：");
        ArrayList<Integer> num = getNum();
        System.out.println(num);
        System.out.println("质数为：");
        ArrayList<Integer> pNum = getPNum(num);
        System.out.println(pNum);
    }
    public static ArrayList<Integer> getNum(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int s = (random.nextInt(99)+2);
            if (!list.contains(s)){
                list.add(s);
            } else {
                i--;
            }
        }
        return list;
    }

    public static ArrayList<Integer> getPNum(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(list.get(i)); j++) {
                if ((int)list.get(i)%j == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
