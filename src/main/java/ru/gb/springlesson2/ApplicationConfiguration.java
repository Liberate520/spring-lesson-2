package ru.gb.springlesson2;

import org.springframework.context.annotation.Bean;

//способ используется когда класс не в вашем проекте
//@Configuration

//В зависимости от файла настроек
//@ConditionalOnProperty
public class ApplicationConfiguration {

    @Bean
    UserRepository myUserRepository() {
        return new UserRepository();
    }
}
