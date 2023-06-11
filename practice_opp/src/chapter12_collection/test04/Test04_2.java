package chapter12_collection.test04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test04_2
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 12:32
 * @Version 1.0
 */
public class Test04_2 {
    public static void main(String[] args) {
        ArrayList lotNumList = lotNum();
        System.out.println("乐透号码已经生成,游戏开始:");
        ArrayList inputList = inputNum();
        System.out.println("您输入的号码为:"+inputList);
        int count  =  countNum(inputList , lotNumList);
        System.out.println("乐透号码为:"+lotNumList);
        System.out.println("猜中了:"+count+"个数字");
    }

    public static int countNum(ArrayList list1,ArrayList list2){
        int i = 0;
        for (Object s : list2){
            if (list1.contains(s)){
                i++;
            }
        }
        return i;
    }

    public static ArrayList inputNum(){
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"个数字[1-50]:");
            int s = input.nextInt();
            if (i == 0 && s <= 50) {
                list.add(s);
            } else if (s <= 50){
                if (list.contains(s)){
                    System.out.println("输入数据重复，重新输入");
                    i--;
                }else {
                    list.add(s);
                }
            }else {
                System.out.println("输入的数字大于50，重新输入");
                i--;
            }
        }
        input.close();
        return list;
    }

    public static ArrayList lotNum(){
        Random random = new Random();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int s = random.nextInt(50) + 1;
            if (!list.contains(s)){
                list.add(s);
            }else {
                i--;
            }
        }
        return list;
    }


}
