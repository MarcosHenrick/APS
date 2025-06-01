package Controle;

import Modelo.Problema;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ProblemaDAO extends DAO implements ICRUD <Problema>{

    @Override
    public void create(Problema obj) throws Exception {
        
        try{
           if(con.isClosed() == false){
               con.close();
           }
        }catch(SQLException e){ 
            
            JOptionPane.showMessageDialog(null, "Erro : " + e);
            
        }
        getConnection();
        
        String q = "INSERT INTO problema (idCliente, idFuncionario) VALUES (null,?, ?, ?, ?)";
        pstmt = con.prepareStatement(q);
        }

    @Override
    public void delete(Problema obj) throws Exception {
         }

    @Override
    public void update(Problema obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Problema> listarDados(Problema obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
