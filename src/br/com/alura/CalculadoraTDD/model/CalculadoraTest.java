package JUnit.src.br.com.alura.CalculadoraTDD.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import JUnit.src.br.com.alura.CalculadoraTDD.Test.CalculadoraTest2;

public class CalculadoraTest {
    
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        CalculadoraTest2 calc = new CalculadoraTest2();
        int soma = calc.somar(3,7);

        Assert.assertEquals(10, soma);
    }

}
