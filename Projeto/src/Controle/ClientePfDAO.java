package Controle;

import Controle.ICRUD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import Modelo.ClientePf;

public class ClientePfDAO extends DAO implements ICRUD <ClientePf> {
 
    @Override
    public void create(ClientePf obj) throws Exception {

        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "INSERT INTO Cliente values (null, ?, ?, ?, ?, ?)";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getNome());
        pstmt.setString(2, obj.getTipo());
        pstmt.setString(3, obj.getDocumento());
        

        pstmt.execute();
    }


    @Override
    public void delete(ClientePf obj) throws Exception {
        
         try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "DELETE FROM ClientePf where id_CPF = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getId_CPF());

        pstmt.execute();

    }

    @Override
    public void update(ClientePf obj) throws Exception {
        
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "UPDATE ClientePf set CPF = ? where id_CPF = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getCPF());
        pstmt.setString(2, obj.getId_CPF());

        pstmt.executeUpdate();

    }

    @Override
    public List<ClientePf> listarDados(ClientePf obj) throws Exception {
    
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();        

        String q = "SELECT * FROM ClientePf";

        pstmt = con.prepareStatement(q);

        rs = pstmt.executeQuery();

        ClientePf t;

        List <ClientePf> listarCLientePf = new ArrayList <ClientePf>();

        while (rs.next()) {
            
            t = new ClientePf();

            t.setId_CPF(rs.getString("id_CPF"));

            t.setCPF(rs.getString("CPF"));

            listarCLientePf.add(t);

        }

        return listarCLientePf;

    }

}