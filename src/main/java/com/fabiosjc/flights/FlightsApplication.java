package com.fabiosjc.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by fabio on 21/08/17.
 */
@Configuration
@EnableSwagger2
@SpringBootApplication
public class FlightsApplication {

    public static void main(final String[] args) {
        SpringApplication.run(FlightsApplication.class, args);
    }

    /**
     * Gerando a documentação das API
     */
    @Bean
    public Docket flightsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Airline Flights API",
                "Airline Flights Challenge API",
                "1.0.0",
                null,
                new Contact("Fábio Henrique", "https://github.com/fabiosjc/flights", ""),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
