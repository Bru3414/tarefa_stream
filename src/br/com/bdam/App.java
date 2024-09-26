package br.com.bdam;

import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		//Texto de pessoas original
		String pessoas = "Bruno-M,Maria-F,Junior-M,Ana-F,Joana-F,Marcos-M,Vitória-F,Fabricio-M,Adriana-F,Felicia-F";
		System.out.println("Texto de pessoas original: ");
		System.out.println(pessoas);
		
		System.out.println(" ");
		
		//Separando as pessoas em uma lista
		List<String> pessoasSeparadas = separaPessoas(pessoas);
		
		//Transformando a lista em stream e deixando somente as pessoas do sexo feminino
		Stream<String> feminino = pessoasSeparadas.stream().filter(pessoa -> pessoa.split("-")[1].equals("F"));
		
		//Impressão
		System.out.println("Pessoas do sexo Feminino: ");
		feminino.sorted().forEach(p -> System.out.println(p.split("-")[0]));

	}

	private static List<String> separaPessoas(String pessoas) {
		List<String> pessoasSeparadas = List.of(pessoas.split(","));
		return pessoasSeparadas;
	}
}
