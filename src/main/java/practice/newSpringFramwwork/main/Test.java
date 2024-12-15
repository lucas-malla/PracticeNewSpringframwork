package practice.newSpringFramwwork.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public void getTest() {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        List<String> namber = Arrays.asList("dLucas1", "eLucas2", "qLucas#", "pLucas4");
        namber.stream()// Uasmos el "stran" para encadenar varias operaciones.
                .sorted()//Ordenas los el Array por orden alfavetica.
                .limit(4)//limitamso nuestra Lista a solo 3 nombr
                .filter(n -> n.startsWith("q"))//filtramos los nombres y treemos solo los que empiezan con la letre N
                .map(n -> n.toUpperCase())//cuando encuenrte el nombre lo va a trasformar el mayuscula.
                .forEach(System.out::println);//porm ultimo el forEach va a recorrer y emprimir todo.
    }
}
