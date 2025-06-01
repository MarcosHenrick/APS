package Modelo;

public class Problema {
    
    private int idProblema;
    private String Descricao;
    private String Prioridade;
    private String Resolucao;

    public int getIdProblema() {
        return idProblema;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getPrioridade() {
        return Prioridade;
    }

    public String getResolucao() {
        return Resolucao;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setPrioridade(String Prioridade) {
        this.Prioridade = Prioridade;
    }

    public void setResolucao(String Resolucao) {
        this.Resolucao = Resolucao;
    }
    
    
}
