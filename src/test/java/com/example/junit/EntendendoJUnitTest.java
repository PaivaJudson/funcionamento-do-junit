package com.example.junit;

import org.junit.*;

public class EntendendoJUnitTest {

    @BeforeClass
    public static void iniciarTeste(){
        System.out.println("Método de teste que Será executado antes de todos os outros métodos");
    }

    @AfterClass
    public static void terminarTeste(){
        System.out.println("Será executado depois de todos os outros métodos de teste");
    }

    @Test
    public void testandoInstrucoes(){
        System.out.println(">>>testandoInstrucoes()<<<");
    }

    @Before
    public void metodoDepoisDoBefore(){
        System.out.println("Executar antes de cada método de teste excepto do BeforeClass");
    }

    @After
    public void metodoAntesdoAfter(){
        System.out.println("Executar depois de cada método de teste excepto do AfterClass");
    }

    @Test
    public void outroTeste(){
        System.out.println("Testando outra coisa");
    }

    @Test
    public void testesReais(){
        String nome = String.format("%s", "Alexandre");
        Assert.assertEquals("Alexandre", nome);
    }
}
