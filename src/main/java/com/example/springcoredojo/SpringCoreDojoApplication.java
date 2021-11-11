package com.example.springcoredojo;


import com.example.springcoredojo.nttData.Config;
import com.example.springcoredojo.nttData.Usuario;
import com.example.springcoredojo.nttData.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			creacionBeans();
			classPathXmlApplicationContext();
			classPathXmlApplicationContextOne();
		};
	}
	private static void creacionBeans(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Usuario usuarioGeneradoPorBeans = context.getBean("usuario", Usuario.class);
		System.out.println("Usuario: "+ usuarioGeneradoPorBeans);
	}
	public void classPathXmlApplicationContext(){
		ApplicationContext context = new  ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuberOne = context.getBean(Youtuber.class);
		System.out.println("youtuberOne: " + youtuberOne.getNombre());
	}

	public void  classPathXmlApplicationContextOne(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Usuario usuarioAnnotation = context.getBean(Usuario.class);
		System.out.println("Usuario: " +usuarioAnnotation.getAlumno().getNombreAlumno());
	}
	}



