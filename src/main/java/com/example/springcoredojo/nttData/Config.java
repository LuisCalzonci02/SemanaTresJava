package com.example.springcoredojo.nttData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Usuario.class)
public class Config {
        @Bean
        public Alumno getAlumno(){
                return new Alumno("Luis", "Calzonci", 22);
            }

        @Bean
        public Youtuber getYoutuber(){
            return new Youtuber("Luis");
        }
}
