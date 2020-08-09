package cn.case1.web;

import cn.case1.config.TestConfig;
import cn.case1.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import javax.validation.Valid;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${name}")
    private String name;

    @Autowired
    private TestConfig testConfig;

    @GetMapping("/test.do")
    public String fun() {
        return "hello";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test1() {
        return name+testConfig.getCity().toString();
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test2(@Valid User1 user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;

        }
        return user.getAge().toString();
    }
}
