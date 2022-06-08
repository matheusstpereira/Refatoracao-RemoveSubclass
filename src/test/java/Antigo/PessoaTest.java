package Antigo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void deveRetornarTipoDocumentoCPF(){
        Fisica pessoa1 = new Fisica();
        assertEquals(true, pessoa1.pessoaFisica());
        assertEquals("CPF", pessoa1.tipoDocumento());
    }

    @Test
    public void deveRetornarTipoDocumentoCNPJ(){
        Juridica pessoa2 = new Juridica();
        assertEquals(false, pessoa2.pessoaFisica());
        assertEquals("CNPJ", pessoa2.tipoDocumento());
    }
}
