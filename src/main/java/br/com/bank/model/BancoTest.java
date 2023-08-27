package br.com.bank.model;

import org.junit.jupiter.*;
import org.junit.jupiter.api.BeforeEach;

public class BancoTest {
    
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco("Nubank");
    }
}
