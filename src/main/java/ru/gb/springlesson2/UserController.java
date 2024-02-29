package ru.gb.springlesson2;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller //возвращает html страницу
@RestController
@RequiredArgsConstructor //если конструктор один
@RequestMapping("/users")
public class UserController {

//    @Autowired
//    @Qualifier("id") подстановка бина по id, это если их несколько
    private final UserRepository repository;

//    @Autowired
//    public UserController(UserRepository repository) {
//        this.repository = repository;
//    }

//    @Autowired
//    public void setRepository(UserRepository repository) {
//        this.repository = repository;
//    }

//    @ResponseBody //если @Controller
//    @RequestMapping(path = "/users", method = RequestMethod.GET)
    @GetMapping("all")
    public List<User> getUsers(){
        return repository.getAll();
    }

    //consumes = что принимаем
    //produces = MediaType.APPLICATION_JSON_VALUE что отдаем
    @GetMapping(value = "test", produces = MediaType.TEXT_HTML_VALUE)
//    @GetMapping(value = "test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String test(){
        return "<h1>Title</h1>";
    }


    @GetMapping(path = "{id}")
    public User getUser(@PathVariable long id){
        return repository.getById(id);
    }

    @GetMapping()
    public User getUser(@RequestParam String name){
//        return repository.getById(id);
        return new User(name);
    }

    @PutMapping("{id}")
    public User update(@PathVariable long id, @RequestBody User user){
        User existUser = repository.getById(id);

        existUser.setName(user.getName());
        return existUser;
    }
}
