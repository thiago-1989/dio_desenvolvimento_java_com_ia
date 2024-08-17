package data_spring_jpa;

import data_spring_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import data_spring_jpa.model.User;

import java.util.List;
import java.util.Scanner;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

    //    List<User> users = repository.filtrarPorNome("Thiago");
        List<User> users = repository.findByNameContaining("Thiago");

        for (User u : users) {
            System.out.println();
            System.out.println(u);
            System.out.println();

        }
        /*
        User user = new User();
        user.setName("Thiago Oliveira");
        user.setUsername("Thiaguinho");
        user.setPassword("987654");

        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println();
            System.out.println(u);
            System.out.println();
        } */
    }
}
