package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b); // .addAll faz a uni�o dos objetos das duas Listas, transformando numa Lista maior.
        System.out.println(c);

        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // .retainAll faz a intersec��o dos objetos das duas Listas, mostra apenas os que t�m em comum.
        System.out.println(d);

        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); // .removeAll remove todos os itens da Lista a que tamb�m estejam na Lista b.
        System.out.println(e);
    }
}