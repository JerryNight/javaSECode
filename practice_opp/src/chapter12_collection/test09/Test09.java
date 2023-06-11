package chapter12_collection.test09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Test09
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 19:46
 * @Version 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        Collection students = new ArrayList();
        students.add(new Student(1,"宋红康",35));
        students.add(new Student(2,"宋橙康",33));
        students.add(new Student(3,"宋黄康",28));
        students.add(new Student(4,"宋绿康",35));
        students.add(new Student(5,"宋青康",33));
        students.add(new Student(6,"宋蓝康",36));
        students.add(new Student(7,"宋紫康",35));
        for(Object o : students){
            System.out.println(o);
        }
        students.remove(new Student(7,"lyt",35));
        System.out.println("----------------");
        for(Object o : students){
            System.out.println(o);
        }
        students.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((Student)o).getAge() == 36;
            }
        });
        System.out.println("----------------");
        for(Object o : students){
            System.out.println(o);
        }
        System.out.println("-----------------");

        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = (Student) iterator.next();
            if ("宋红康".equals(s.getName())){
                iterator.remove();
            }
        }
        for(Object o : students){
            System.out.println(o);
        }

    }
}
