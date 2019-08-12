package com.sx.practice.ormMapping;

import com.sx.practice.ormMapping.annotation.Field;
import com.sx.practice.ormMapping.annotation.Table;

/** 学生实体
 * @author shuxin
 * @date 2019/8/12 - 17:09
 */
@Table("student")
public class Student {
    @Field(name = "sname",type = "varchar", length = 20)
    private String name;
    @Field(name="sage",type="int", length = 20)
    private int age;
    @Field(name="ssex",type="int", length = 2)
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
