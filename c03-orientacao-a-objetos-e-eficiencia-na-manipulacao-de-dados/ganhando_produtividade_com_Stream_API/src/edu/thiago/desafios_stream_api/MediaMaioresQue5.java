package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class MediaMaioresQue5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaMaiores = numeros.stream().filter(num -> num > 5).mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(mediaMaiores);

        /*
        int totalMaiores = 0;
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> maioresQue5 = numeros.stream().filter(n -> n > 5).toList();
         for (Integer num : maioresQue5) {
             totalMaiores += num;
         }
        System.out.println(totalMaiores/maioresQue5.size());
         */
    }
}
