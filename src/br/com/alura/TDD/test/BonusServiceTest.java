package JUnit.src.br.com.alura.TDD.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import JUnit.src.br.com.alura.TDD.model.Funcionario;
import JUnit.src.br.com.alura.TDD.service.BonusService;

public class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        // Primeira maneira: 
        // assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"))));

        //Segunda Maneira:
       try {
            service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu boa");
       } catch (Exception e) {
            assertEquals("Funcionario com salario maior do que R$1000 não pode receber bônus", e.getMessage());
       }
        
    }

    @Test
    public void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000.00")));

        assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    public void bonusDeveriaSer10PorCentoParaSalarioDeExatamento10000(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
    
}
