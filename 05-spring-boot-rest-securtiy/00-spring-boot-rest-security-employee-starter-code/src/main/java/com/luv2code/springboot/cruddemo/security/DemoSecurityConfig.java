package com.luv2code.springboot.cruddemo.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

  // add support for jdbc ... no hard-coded users and roles
  @Bean
  public UserDetailsManager userDetailsManager(DataSource dataSource) {
    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
    // define query to retrieve user by username
    jdbcUserDetailsManager.setUsersByUsernameQuery(
        "select user_id, pw, active from members where user_id=?");
    // define query to retrieve the roles/authorities
    jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
        "select user_id, role from roles where user_id=?");
    return jdbcUserDetailsManager;
  }

  //   adding a security chain filter  for different roles
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
        auth ->
            auth.requestMatchers(HttpMethod.GET, "/api/employees")
                .hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.GET, "/api/employees/**")
                .hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.POST, "/api/employees")
                .hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT, "/api/employees")
                .hasRole("MANAGER")
                .requestMatchers(HttpMethod.PATCH, "/api/employees/**")
                .hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/employees/**")
                .hasRole("ADMIN"));
    // use HTTP Basic authentication
    http.httpBasic(withDefaults());
    // disable CSRF for simplicity (not recommended for production)
    http.csrf(csrf -> csrf.disable());
    return http.build();
  }

  // @Bean
  //   public InMemoryUserDetailsManager userDetailsManager() {
  //     UserDetails john =
  //         User.builder().username("john").password("{noop}test123").roles("EMPLOYEE").build();

  //     UserDetails mary =
  //         User.builder()
  //             .username("mary")
  //             .password("{noop}test123")
  //             .roles("EMPLOYEE", "MANAGER")
  //             .build();
  //     UserDetails susan =
  //         User.builder()
  //             .username("susan")
  //             .password("{noop}test123")
  //             .roles("EMPLOYEE", "MANAGER", "ADMIN")
  //             .build();

  //     return new InMemoryUserDetailsManager(john, mary, susan);
  //   }
}
