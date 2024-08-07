package data_spring_jpa;

import data_spring_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import data_spring_jpa.model.AppUser;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        AppUser usuario = new AppUser();
        usuario.setName("Thiago");
        usuario.setUsername("th123");
        usuario.setPassword("123456");

        repository.save(usuario);

        for (AppUser u : repository.findAll()) {
            System.out.println();
            System.out.println(u);
            System.out.println();
        }
    }
}
