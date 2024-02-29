package ru.gb.springlesson2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Service разделение по смыслу (бизнес-логика), содержит аннотацию Component
//@Repository (связь с бд)
//@Lazy создание бина именно в момент использования
//@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON) // prototype

//@Primary
@Component //("myUserRepositoryBean") по умолчанию userRepository
public class UserRepository {
    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User("Костя"));
        users.add(new User("Василий"));
        users.add(new User("Семен"));
        users.add(new User("Кирилл"));
        users.add(new User("Светлана"));
    }

    public List<User> getAll(){
        return List.copyOf(users);
    }

    public User getById(long id){
        return users.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
