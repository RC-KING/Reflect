import java.lang.reflect.Field;

/**
 * 获取成员变量
 */
public class Demo04 {
    public static void main(String[] args) throws Exception{
        Class<?> person = Class.forName("Person");

        // 获取所有的成员变量
        Field[] declaredFields = person.getFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // 通过变量名获取指定变量
        Field name = person.getDeclaredField("name");
        System.out.println(name);

    }
}
