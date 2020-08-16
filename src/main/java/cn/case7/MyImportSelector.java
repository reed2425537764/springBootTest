package cn.case7;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 17:29
 */
//返回的数组中类会被spring容器托管
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //可以获取注解的详细信息，然后根据信息去动态的返回需要被spring管理的bean
        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableMyImport.class.getName()));
        return new String[]{"cn.case7.AsyncBean", Case7Config.class.getName()};
    }
}
