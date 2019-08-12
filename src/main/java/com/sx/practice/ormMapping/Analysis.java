package com.sx.practice.ormMapping;

import com.sx.practice.ormMapping.annotation.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**解析注解程序
 * @author shuxin
 * @date 2019/8/12 - 17:19
 */
public class Analysis {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.获取实体class字节码
        //Class stu = Student.class;
        Class stu = Class.forName("com.sx.practice.ormMapping.Student");

        //2.获取实体对应的表名
        Table table  = (Table) stu.getAnnotation(Table.class);
        String tableName = table.value();

        //3.获取实体属性对应的信息
        Field[] fields = stu.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            //获取属性上的Field注解
            com.sx.practice.ormMapping.annotation.Field anno = field.getAnnotation(com.sx.practice.ormMapping.annotation.Field.class);
            String name = anno.name();
            String type = anno.type();
            int length = anno.length();
            System.out.println("name:"+name+" type："+type+" length:"+length );
            //拼接sql语句  略....
        }
        //4.连接mysql，执行创建table的mysql 略....
    }
}
