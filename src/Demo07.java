import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反射 泛型的擦除
 * List<Integer>中存放String类型的数据
 * java中的泛型是伪泛型,在class文件中是没有泛型的
 * 而反射玩的就是.class文件,绕过编译器的检查,实现泛型的擦除
 */
public class Demo07 {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arrayList = new ArrayList<>();
        Class aClass = arrayList.getClass();
        Method add = aClass.getMethod("add", Object.class);
        // 存字符串
        add.invoke(arrayList, "qqqqq");
        // 存int类型
        add.invoke(arrayList, 123);
        System.out.println(arrayList);
    }
}
