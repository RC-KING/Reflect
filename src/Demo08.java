import sun.management.Agent;

import java.lang.reflect.Field;

/**
 *
 */
public class Demo08 {
    public static void main(String[] args)throws Exception {
        Person person = new Person();
        new Demo08().setProperties(person, "kkk", "jdd");
    }
    public void setProperties(Object obj,String PropertiesName,Object value)throws Exception{
        Class<?> aClass = obj.getClass();
        System.out.println(aClass);

        Field field = aClass.getDeclaredField(PropertiesName);
        System.out.println(field);

        field.setAccessible(true);
        field.set(obj, value);
        System.out.println(obj);


    }
}
