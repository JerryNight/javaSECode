package chapter12_collection.test12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName: Test12
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 20:22
 * @Version 1.0
 */
public class Test12 {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("liusan",20,90.0));
        set.add(new Student("lisi",22,90.0));
        set.add(new Student("wangwu",20,99.0));
        set.add(new Student("sunliu",22,100.0));
        System.out.println("按照成绩和年龄排序");
        for (Object object : set) {
            System.out.println(object);
        }


        ArrayList list = new ArrayList();
        list.add(new Student("liusan",20,90.0));
        list.add(new Student("lisi",22,90.0));
        list.add(new Student("wangwu",20,99.0));
        list.add(new Student("sunliu",22,100.0));
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student)o1).getName().compareTo(((Student)o2).getName()) ;
            }
        });
        System.out.println("按照姓名排序");
        for (Object o : list){
            System.out.println(o);
        }
    }
}
