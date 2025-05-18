public class ClientePj extends Cliente {
    
    private String pj;
    private String id_pj;

    public ClientePj(String nome, String telefone, String endereco, String pj, String id_pj) {
        
        super(nome, telefone, endereco);
        
    }

    @Override
    public void status() {
        
        super.status();
        System.out.println("Pj: " + this.pj);
        System.out.println("id Pj: " + id_pj);
    }

    public String getId_pj() {
        return id_pj;
    }
    public String getPj() {
        return pj;
    }

    public void setId_pj(String id_pj) {
        this.id_pj = id_pj;
    }
    public void setPj(String pj) {
        CNPJ cnpj = new CNPJ();
        cnpj.verificarCNPJ(pj);
        this.pj = pj;
    }
}
