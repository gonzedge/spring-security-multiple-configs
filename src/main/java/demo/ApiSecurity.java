package demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
@Order(1)
public class ApiSecurity extends DemoSecurityConfigurer {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .antMatcher("/api/**")
            .authorizeRequests()
            .antMatchers("/api/home").permitAll()
            .anyRequest().authenticated()
            .and()
            .httpBasic();
    }
}
