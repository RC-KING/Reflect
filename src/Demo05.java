import java.lang.reflect.Method;

/**
 * 获取成员方法
 * 注意里面的分类:继承的,自己的,实现的
 */
public class Demo05 {
    public static void main(String[] args) throws Exception{
        Class<?> person = Class.forName("Person");
        // 获取全部公共方法,包括继承的 getMethods() 都是public
        Method[] methods = person.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("==============================");
        // 指定方法获取空参方法
        Method show = person.getMethod("show");
        System.out.println(show);
        // 指定方法获取有参方法
        Method show2 = person.getMethod("show",String.class, int.class);
        System.out.println(show2);

        // 获取对象
        Object o = person.newInstance();
        // 运行获取到的方法
        show.invoke(o);
        show2.invoke(o, "jdd",18);

    }


}
