package Modelo;

public class ClientePf extends Cliente{

    private String CPF;
    private String tipo = "CPF";
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        CPF cpf = new CPF();
        cpf.validarCpf(CPF);
        this.CPF = CPF;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
