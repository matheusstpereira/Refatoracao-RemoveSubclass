package Novo;

public class Pessoa {

    public boolean pessoaFisica;
    public String tipoDocumento;

    public boolean getPessoaFisica() {
        return pessoaFisica;
    }
    private void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getTipoDocumento() {return tipoDocumento;}
    private void setTipoDocumento(String tipoDocumento) {this.tipoDocumento = tipoDocumento;}

    protected Pessoa(boolean pessoaFisica, String tipoDocumento){
        this.pessoaFisica = pessoaFisica;
        this.tipoDocumento = tipoDocumento;
    }

    public static Pessoa CriarPessoaFisica(){
        return new Pessoa(true, "CPF");
    }
    public static Pessoa CriarPessoaJuridica(){
        return new Pessoa(false, "CNPJ");
    }

}