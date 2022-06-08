package Novo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void deveRetornarTipoDocumentoCPF(){
        Pessoa pessoa1 = Pessoa.CriarPessoaFisica();
        assertEquals(true, pessoa1.pessoaFisica);
        assertEquals("CPF", pessoa1.tipoDocumento);
    }

    @Test
    public void deveRetornarTipoDocumentoCNPJ(){
        Pessoa pessoa2 = Pessoa.CriarPessoaJuridica();
        assertEquals(false, pessoa2.pessoaFisica);
        assertEquals("CNPJ", pessoa2.tipoDocumento);
    }

}
