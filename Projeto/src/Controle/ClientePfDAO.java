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
            
            if(con != null && !con.isClosed()){

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
        pstmt.setString(3, obj.getCPF());
        pstmt.setString(4, obj.getEndereco());
        pstmt.setString(5, obj.getTelefone());

        pstmt.execute();
    }


    @Override
    public void delete(ClientePf obj) throws Exception {
        
         try {
            
            if(con != null && !con.isClosed()){

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
    public void update(ClientePf obj) throws Exception {
        
        try {
            
            if(con != null && !con.isClosed()){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "UPDATE Cliente set Nome = ?, Tipo = ?, Documento = ?, Endereco = ?, Telefone = ? where idCliente = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getNome());
        pstmt.setString(2, obj.getTipo());
        pstmt.setString(3, obj.getCPF());
        pstmt.setString(4, obj.getEndereco());
        pstmt.setString(5, obj.getTelefone());
        pstmt.setInt(6, obj.getId());
        

        pstmt.executeUpdate();

    }

    @Override
    public List<ClientePf> listarDados(ClientePf obj) throws Exception {
    List<ClientePf> listarClientePf = new ArrayList<>();

    try {
        getConnection();

        String q = "SELECT * FROM Cliente";
        pstmt = con.prepareStatement(q);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            ClientePf t = new ClientePf();
            t.setId(rs.getInt("idCliente"));
            t.setNome(rs.getString("Nome"));
            t.setTipo(rs.getString("Tipo"));
            t.setCPF(rs.getString("Documento"));
            t.setEndereco(rs.getString("Endereco"));
            t.setTelefone(rs.getString("Telefone"));

            listarClientePf.add(t);
        }
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Erro: " + e);
    } finally {

        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (con != null) con.close();
    }

    return listarClientePf;
    }
}