package dio.springboot.app;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma(int a, int b){
        return a + b;
    }
}