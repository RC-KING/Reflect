import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  获取 所有公共权限(public)构造方法 getConstructors() 返回构造方法对象
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        // 获取class文件对象
        Class person = Class.forName("Person");
        // 获取所有公共权限构造器
        Constructor[] constructors = person.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        // 通过参数列表获取指定的构造器

        // 获取空构造器
        Constructor constructor = person.getConstructor();
        // 运行获取到的构造方法
        Object o = constructor.newInstance();
        System.out.println(o);


        // 获取带参的构造器
        Constructor constructor2 = person.getConstructor(String.class,int.class);
        Object o2 = constructor2.newInstance("金大大",18);
        System.out.println(o2);

        // 简单获取构造器并运行(前提是有public空参构造器)
        Object o3 = person.newInstance();
        System.out.println(o3);


    }
}
