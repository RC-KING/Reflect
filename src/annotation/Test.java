package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@PersonA(className = "annotation.Person",name = "jdd",age = 18)
public class Test {
    public static void main(String[] args) throws Exception {
        //- 获取注解定义的位置下的对象(定义在类上就是Class对象,定义在方法上就是Method对象...)
        Class<?> TestClass = Class.forName("annotation.Test");
        // 获取指定注解 getAnnotation(注解的Class)
        PersonA annotation = TestClass.getAnnotation(PersonA.class);
        // 调用注解的抽象方法,获取返回值
        /* 获取值的本质原理
             class PersonAImpl implements PersonA{
                @Override
                public String name() {
                return null;
                }
                @Override
                public int age() {
                return 0;
                }
             }
         */
        String className = annotation.className();
        String name = annotation.name();
        int age = annotation.age();

        // ---------------- 使用注解传入的值,进行创建Person对象并赋值 -------------------
        Class<?> PersonClass = Class.forName(className);
        Object o = PersonClass.newInstance();
        Field name1 = PersonClass.getDeclaredField("name");
        Field age1 = PersonClass.getDeclaredField("age");
        name1.setAccessible(true);
        age1.setAccessible(true);
        name1.set(o,name);
        age1.set(o, age);
        System.out.println(o);
    }

}
