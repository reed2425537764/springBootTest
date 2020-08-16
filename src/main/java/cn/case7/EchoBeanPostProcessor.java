package cn.case7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/16 21:25
 */
public class EchoBeanPostProcessor implements BeanPostProcessor {

    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (String s : packages) {
            if (bean.getClass().getName().startsWith(s)) {
                System.out.println("echo:  " + bean.getClass().getName());
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
