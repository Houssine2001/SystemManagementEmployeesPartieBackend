package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Désactive la protection CSRF pour une API REST
                .authorizeHttpRequests(auth -> auth
                        // Autorise l'accès sans authentification à ces chemins spécifiques
                        .requestMatchers("/api/employees/**", "/api/employees/nom/**", "/api/history/**", "/api/history/employee/**").permitAll()
                        .anyRequest().authenticated() // Exige une authentification pour toutes les autres requêtes
                )
                .httpBasic(); // Active l'authentification HTTP Basic

        return http.build();
    }

    // Définir un utilisateur en mémoire avec un mot de passe (simple, sans cryptage dans cet exemple)
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> User.builder()
                .username("admin")
                .password("b4594e9a-2648-47b0-a7fb-84b45afae6f6") // mot de passe en clair
                .roles("USER") // Le rôle de l'utilisateur
                .build();
    }

    // Utiliser NoOpPasswordEncoder pour un mot de passe non crypté (simple pour cet exemple)
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
