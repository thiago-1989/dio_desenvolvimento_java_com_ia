package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements ApplicationRunner {

    @Value("${nome}")
    private String nome;

    private final Calculadora calculadora;

    public MyApp(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.printf("O resultado obtido por %s foi %d",nome, calculadora.soma(5, 15));
    }
}
