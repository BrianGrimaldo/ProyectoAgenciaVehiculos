package com.example.AgenciaAutos;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final StringToObjectIdConverter stringToObjectIdConverter;

    public WebConfig(StringToObjectIdConverter stringToObjectIdConverter) {
        this.stringToObjectIdConverter = stringToObjectIdConverter;
    }

    @Override
    public void addFormatters(@SuppressWarnings("null") FormatterRegistry registry) {
        registry.addConverter(stringToObjectIdConverter);
    }
}
