package cn.case1.config;

//springBoot属性注入一
//@ConfigurationProperties(prefix = "jdbc")
//@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
