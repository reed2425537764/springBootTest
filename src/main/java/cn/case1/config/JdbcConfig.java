package cn.case1.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)//springBoot属性注入一
public class JdbcConfig {


    /*@Autowired
    private JdbcProperties jdbcProperties;

    JdbcConfig(JdbcProperties jdbcProperties) {

    }*/


    //springBoot属性注入一
    /*@Bean
    public DataSource dataSource(JdbcProperties jdbcProperties) {
        DruidDataSource druid = new DruidDataSource();
        druid.setDriverClassName(jdbcProperties.getDriverClassName());
        druid.setUrl(jdbcProperties.getUrl());
        druid.setUsername(jdbcProperties.getUsername());
        druid.setPassword(jdbcProperties.getPassword());
        return druid;
    }*/

    //springBoot属性注入一
    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/
}
