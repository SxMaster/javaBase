package com.sx.practice.ormMapping.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**属性 注解
 * 说明:用来说明实体某一属性在数据库中的名称，类型，长度信息
 * @author shuxin
 * @date 2019/8/12 - 17:13
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Field {
    String name();
    String type();
    int length();
}
