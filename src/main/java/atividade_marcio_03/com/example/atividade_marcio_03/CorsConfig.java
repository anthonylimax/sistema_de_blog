package atividade_marcio_03.com.example.atividade_marcio_03;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir solicitações de todas as origens
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // Permitir os métodos HTTP especificados
    }
}