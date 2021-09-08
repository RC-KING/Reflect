package CalculateTestDemo;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.time.temporal.ValueRange;

public class CheckFrame {


    public static void main(String[] args) throws Exception {
        // 获取Calculate类
        Class<?> aClass = Class.forName("CalculateTestDemo.Calculate");
        Object o = aClass.newInstance();
        // 获取该类的所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();

        int errorNum = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("F:\\CodeFiles\\demo\\reflect\\src\\CalculateTestDemo\\bug.txt"));



        // 判断方法上是否有注解
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Check.class)) {
                try {
                    declaredMethod.invoke(o);
                } catch (Exception e) {
                    // bug+1
                    errorNum++;
                    // 写文件
                    bufferedWriter.write(declaredMethod.getName() + "方法出问题辣!");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称:" + e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因:" + e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("===================");
                    bufferedWriter.newLine();

                }
            }



        }
        bufferedWriter.write("本次共检测"+declaredMethods.length+"个方法");
        bufferedWriter.newLine();
        bufferedWriter.write("一共"+errorNum+"出错");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}


