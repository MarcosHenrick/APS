package Controle;

import Controle.ICRUD;
import Modelo.ClientePf;
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

        String q = "INSERT INTO Cliente values (null, ?, ?, ?, ?, ?)";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getNome());
        pstmt.setString(2, obj.getTipo());
        pstmt.setString(3, obj.getCNPJ());
        pstmt.setString(4, obj.getEndereco());
        pstmt.setString(5, obj.getTelefone());

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

        String q = "DELETE FROM Cliente where idCliente = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setInt(1, obj.getId());

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

        String q = "UPDATE Cliente set CPF = ? where idCliente = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getCNPJ());
        pstmt.setInt(2, obj.getId());

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

        String q = "SELECT * FROM Cliente";

        pstmt = con.prepareStatement(q);

        rs = pstmt.executeQuery();

        ClientePj t;

        List <ClientePj> listarCLientePj = new ArrayList <ClientePj>();

        while (rs.next()) {
            
            t = new ClientePj();
            
            if(t.getTipo().equals("CNPJ")){
                
                t.setId(rs.getInt("idCliente"));
                
                t.setNome(rs.getString("Nome"));
                           
                t.setTipo(rs.getString("CNPJ"));
                
                t.setCNPJ(rs.getString("Documento"));
                
                t.setEndereco(rs.getString("Endereço"));
                
                t.setTelefone(rs.getString("Telefone"));
                
            }    
           

            listarCLientePj.add(t);

        }

        return listarCLientePj;

    }

}