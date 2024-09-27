package br.com.bdam.test;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import br.com.bdam.App;

public class TesteLista {
	
	@Test
	public void test() {
		
		List<String> pessoasSeparadas = App.separaPessoas("Bruno-M,Maria-F,Junior-M,Ana-F,Joana-F,Marcos-M,Vitória-F,Fabricio-M,Adriana-F,Felicia-F");
		Stream<String> feminino = App.streamFeminino(pessoasSeparadas);

		feminino.forEach(pessoa -> Assert.assertEquals("F", pessoa.split("-")[1]));
		
	}

}
