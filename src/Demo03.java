import java.lang.reflect.Constructor;

/**
 * 获取私有构造方法并运行
 * 凡是带有declared的方法就是获取的私有的方法
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        // 获取class文件对象
        Class person = Class.forName("Person");
        // 获取私有构造器
        Constructor declaredConstructor = person.getDeclaredConstructor(int.class);
        // 私有方法运行许可
        declaredConstructor.setAccessible(true);
        // 使用构造器
        Object o = declaredConstructor.newInstance(18);
        System.out.println(o);
    }
}
