package com.productManager.auth.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Documentation", description = "Framework in Spring Boot", version = "v1", license = @License(name = "Flexidev", url = "https://www.flexidev.co")))
public class SwaggerConfig {

}