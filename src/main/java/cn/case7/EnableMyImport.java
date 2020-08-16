package cn.case7;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 17:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class)
public @interface EnableMyImport {
    String name();
}
