package Controle;

import Controle.ICRUD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.ClientePj;

public class ClientePjDAO extends DAO implements ICRUD <ClientePj> {
    
    @Override
    public void create(ClientePj obj) throws Exception {

        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "INSERT INTO ClientePj values (null, ?)";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getId_pj());
        pstmt.setString(2, obj.getPj());

        pstmt.execute();
    }


    @Override
    public void delete(ClientePj obj) throws Exception {
        
         try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "DELETE FROM ClientePj where id_Pj = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getId_pj());

        pstmt.execute();

    }

    @Override
    public void update(ClientePj obj) throws Exception {
        
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "UPDATE ClientePj set pj = ? where id_pj = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getPj());
        pstmt.setString(2, obj.getId_pj());

        pstmt.executeUpdate();

    }

    @Override
    public List<ClientePj> listarDados(ClientePj obj) throws Exception {
    
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();        

        String q = "SELECT * FROM ClientePj";

        pstmt = con.prepareStatement(q);

        rs = pstmt.executeQuery();

        ClientePj t;

        List <ClientePj> listarCLientePj = new ArrayList <ClientePj>();

        while (rs.next()) {
            
            t = new ClientePj();

            t.setId_pj(rs.getString("id_CNPJ"));

            t.setPj(rs.getString("CNPJ"));

            listarCLientePj.add(t);

        }

        return listarCLientePj;

    }
}
