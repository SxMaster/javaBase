package com.sx.practice.ormMapping.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**表名 注解
 * 说明：用来说明实体对应数据库表的名字
 * @author shuxin
 * @date 2019/8/12 - 17:10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}
