/**
 * 1 获取运行时期一个class文件的对象
 * 2 对象描述类 java.lang.Class
 * 3 获取一个类的class对象有三个方法
 *      1 先new一个对象出来,再使用 对象.getClass()方法获取
 *          静态代码块运行
 *      2 使用类的静态属性class获取
 *          静态代码块不运行
 *      3 使用Class类的静态方法forName("类名全称") #注意要写全路径#
 *          静态代码块运行!!!
 */
public class Demo01 {
    public static void main(String[] args) {
        // 方法1
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        System.out.println(personClass);

        // 方法2
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);
        // 都是真!!!!
        System.out.println(personClass==personClass1);
        System.out.println(personClass.equals(personClass1));

        // 方法3(常用!!!)
        try {
            Class<Person> personClass2 = (Class<Person>) Class.forName("Person");
            System.out.println(personClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
