import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * 使用配置,加载类,运行方法
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {
        // 创建集合对象
        Properties properties = new Properties();
        // 读取配置文件
        FileInputStream fis = new FileInputStream("F:\\CodeFiles\\demo\\reflect\\src\\config.txt");
        // 将读取到的键值对放入集合
        properties.load(fis);
        fis.close();
        System.out.println(properties);
        String methodName=properties.getProperty("methodName");
        String className=properties.getProperty("className");

        Class<?> personClass = Class.forName(className);

        personClass.getMethod(methodName).invoke(personClass.newInstance());

    }

}
