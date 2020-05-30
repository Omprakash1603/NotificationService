package com.retail.platform.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.regex("/order.*"))
				.apis(RequestHandlerSelectors.basePackage("com.retail.platform")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Suppilier API", "Order service for retail platform", "v1.0", "termsOfServiceUrl",
				new springfox.documentation.service.Contact("Omprakash", "https://www.nineleaps.com",
						"omprakash@nineleaps.com"),
				"Api License", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
	}
}
