package net.gooks.springstudy.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@Profile("local")
public class WebLocalConfiguration {

    /*
    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebdavServlet());
        registrationBean.addUrlMappings("/h2/*");
        return registrationBean;
    }
    */

/*
    public DataSource dataSource() throws SQLException {
        Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
        return new com.zaxxer.hikari.HikariDataSource();
    }


    @Bean
    public Server h2TcpServer() throws SQLException {
        return Server.createTcpServer().start();
    }*/
}
