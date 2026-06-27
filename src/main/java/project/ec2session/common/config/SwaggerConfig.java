package project.ec2session.common.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "EC2 Session App",
                description = "EC2Session API 명세",
                version = "v1"
        )
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT",
        description = "JWT 토큰을 입력하세요. 예: Bearer {token}"
)
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi openApi() {
        return GroupedOpenApi.builder()
                .group("EC2Session API v1")
                .pathsToMatch("/**")
                .build();
    }
}
