package com.example.demo;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TareaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaCrudApplication.class, args);
	}
	@Bean
	public Docket clienteApi() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
			.paths(regex("/api.*"))
			.build()
			.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo api= new ApiInfo(
				"PROYECTO API REST",
				"API REST",
				"V 1.0.0",
				"Terminos de servicio",
				new Contact("Lisseth Sizalima","lisseth@hotmail.com","0982939619"),
				"Apache License Version 2.0",
				"https://www.apache.org/licesen.html",new ArrayList<VendorExtension>()
				
				);
		return api;
	}

}
