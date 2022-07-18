package JUnit.src.br.com.alura.TDD.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import JUnit.src.br.com.alura.TDD.model.Desempenho;
import JUnit.src.br.com.alura.TDD.model.Funcionario;
import JUnit.src.br.com.alura.TDD.service.ReajusteService;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach // Inicialize
    public void inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @AfterEach
    public void finalizar(){
        System.out.println("Fim");
    }

    @BeforeAll
    public static void antesDeTodos(){
        System.out.println("Antes de todos");
    }

    @AfterAll
    public static void depoisDeTodos(){
        System.out.println("Depois de todos");
    }

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesepenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
    
}
