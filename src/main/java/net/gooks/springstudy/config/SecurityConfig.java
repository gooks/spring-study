package net.gooks.springstudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        /*
        web.ignoring().antMatchers(
                "/**"
        );
        */
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/mypage").authenticated()
                .antMatchers("/**").permitAll()
                .antMatchers("/h2/**").permitAll();
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
