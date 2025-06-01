package Modelo;

public class ClientePj extends Cliente {
    
    private String CNPJ;
    private String tipo = "CNPJ";
   
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String pj) {
        CNPJ cnpj = new CNPJ();
        cnpj.verificarCNPJ(pj);
        this.CNPJ = pj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
