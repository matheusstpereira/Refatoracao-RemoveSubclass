package Antigo;

public abstract class Pessoa {

    public abstract boolean pessoaFisica();
    public abstract String tipoDocumento();

}

class Fisica extends Pessoa{
    public boolean pessoaFisica(){
        return true;
    }

    @Override
    public String tipoDocumento(){
        return "CPF";
    }
}

class Juridica extends Pessoa{
    public boolean pessoaFisica(){
        return false;
    }

    @Override
    public String tipoDocumento(){
        return "CNPJ";
    }
}