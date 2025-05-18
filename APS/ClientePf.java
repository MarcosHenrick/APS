public class ClientePf extends Cliente{

    private String id_CPF;
    private String CPF;

    public ClientePf(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        //TODO Auto-generated constructor stub
    }

    public String getId_CPF() {
        return id_CPF;
    }
    public String getCPF() {
        return CPF;
    }

    public void setId_CPF(String id_CPF) {
        this.id_CPF = id_CPF;
    }

    public void setCPF(String CPF) {
        CPF cpf = new CPF();
        cpf.validarCpf(CPF);
        this.CPF = CPF;
    }
    
}
