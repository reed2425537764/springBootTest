package cn.case1.pojo;

import javax.validation.constraints.Min;

public class User1 {
    @Min(value = 20, message = "too young to access")
    private Integer age;

    @Override
    public String toString() {
        return "User1{" +
                "age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
