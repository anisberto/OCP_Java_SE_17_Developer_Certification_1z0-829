package com.anisberto.certificacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		
		Stream<Integer> mapa = lista.stream().limit(3).map(e -> e * 2);
		
		mapa.forEach(e -> System.out.println(e));
	}
}