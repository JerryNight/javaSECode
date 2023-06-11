package chapter12_collection.test12;

/**
 * ClassName: Student
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 20:22
 * @Version 1.0
 */
public class Student implements Comparable{
    @Override
    public int compareTo(Object o) {
        double i = this.getScore()-((Student)o).getScore();
        if (i > 0){
            return -1;
        } else if (i < 0) {
            return 1;
        }else {
            return this.getAge()-((Student)o).getAge();
        }
    }
    private String name;
    private int age;
    private double score;
    public Student(String name, int age, double score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public Student() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
    }


}
