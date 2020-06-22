package com.fedorenko.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LanguageStudyApiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LanguageStudyApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(LanguageStudyApiApplication.class);
        sa.run(args);
    }
}
<<<<<<< HEAD
1
=======
>>>>>>> 2da33c25e2cd3f367dd47b4fffcf58e3cc82eb63
