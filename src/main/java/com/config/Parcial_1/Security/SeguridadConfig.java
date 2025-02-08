package com.config.Parcial_1.Security;

import org.springframework.context.annotation.Bean; //Se agrego la importacion de Bean q es para el SecurityFilterChain

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/* import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 
 * WebSecurityConfigurerAdapter en las ultimas versiones ya no se utiliza, se utiliza SecurityFilterChain
*/
import org.springframework.security.web.SecurityFilterChain; 


@Configuration
@EnableWebSecurity
/* public class SeguridadConfig extends WebSecurityConfigurerAdapter { 
 * En las ultimas versiones ya no se utiliza, se utiliza SecurityFilterChain
*/
public class SeguridadConfig {

    @Bean
    /*protected void configure(HttpSecurity http) throws Exception { 
     * En las ultimas versiones ya no se utiliza, se utiliza SecurityFilterChain
    */
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            /* .authorizeRequests() 
             * En las ultimas versiones ya no se utiliza, se utiliza authorizeHttpRequests
            */
            .authorizeHttpRequests(auth -> auth

                /* .antMatchers("/publico").permitAll() 
                 * En las ultimas versiones ya no se utiliza, se utiliza requestMatchers
                */
                .requestMatchers("/publico", "/privado", "/css/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin()
                .and()
            .httpBasic();

        /*
         * http.build() es para construir el objeto SecurityFilterChain
        */
        return http.build(); 
    }
}