public class ClientePj extends Cliente {
    
    private String pj;
   
    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        CNPJ cnpj = new CNPJ();
        cnpj.verificarCNPJ(pj);
        this.pj = pj;
    }
}
