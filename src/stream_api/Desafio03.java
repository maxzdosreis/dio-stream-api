package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,5);

        boolean todosPositivos = numeros.stream()
                                        .allMatch(numero -> numero > 0);

        System.out.println("Todos os números são positivos? " + todosPositivos);
    }
}
