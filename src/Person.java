import java.time.Period;

public class Person {
    public String kkk="100";
    private String name;
    private int age;


    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 私有构造器
     */
    private Person(int age){
        this.age=age;
    }

    public void show(String name, int age){
        System.out.println(name+"==="+age);
    }

    public void show(){
        System.out.println("你好!");
    }

    /**
     * 私有方法
     * @param name
     * @param age
     */
    private void show2(String name, int age){
        System.out.println(name+"==!=="+age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "kkk='" + kkk + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getKkk() {
        return kkk;
    }

    public void setKkk(String kkk) {
        this.kkk = kkk;
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
}
