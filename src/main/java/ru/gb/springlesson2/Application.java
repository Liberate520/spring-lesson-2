package ru.gb.springlesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext contex = SpringApplication.run(Application.class, args);

		//для корректной работы нужно установить плагин lombok
//		User user = new User("Костя");
//		System.out.println(user);

//		UserRepository repository = new UserRepository();
//		System.out.println(repository.getAll());
//		System.out.println(repository.getById(2));

//		UserRepository repository = contex.getBean(UserRepository.class);
//		System.out.println(repository.getAll());
//		System.out.println(repository.getById(2));

//		UserRepository repository1 = contex.getBean(UserRepository.class);
//		UserRepository repository2 = contex.getBean(UserRepository.class);
//		UserRepository repository3 = contex.getBean(UserRepository.class);
//		System.out.println(repository1 == repository2);
//		System.out.println(repository1 == repository3);

//		UserRepository repository = contex.getBean("myUserRepositoryBean", UserRepository.class);

//		UserRepository repository = contex.getBean("myUserRepository", UserRepository.class);
//		UserRepository repository2 = contex.getBean(UserRepository.class); будет конфликт, так как 2 бина подходят
	}

}
