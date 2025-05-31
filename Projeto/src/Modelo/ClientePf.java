public class ClientePf extends Cliente{

    private String CPF;

    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        CPF cpf = new CPF();
        cpf.validarCpf(CPF);
        this.CPF = CPF;
    }
    
}
