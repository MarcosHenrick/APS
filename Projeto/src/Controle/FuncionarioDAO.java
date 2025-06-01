package Controle;

import Modelo.Funcionario;
import Controle.ICRUD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import Modelo.Funcionario;

public class FuncionarioDAO extends DAO implements ICRUD <Funcionario>{

    @Override
    public void create(Funcionario obj) throws Exception {

        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "INSERT INTO funcionario values (null, ?)";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getId_Funcionario());
        pstmt.setString(2, obj.getNome());

        pstmt.execute();
    }


    @Override
    public void delete(Funcionario obj) throws Exception {
        
         try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "DELETE FROM funcionario where id_Funcionario = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getId_Funcionario());

        pstmt.execute();

    }

    @Override
    public void update(Funcionario obj) throws Exception {
        
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();

        String q = "UPDATE funcionario set nomeFuncionario = ? where idFuncionario = ?";

        pstmt = con.prepareStatement(q);

        pstmt.setString(1, obj.getNome());
        pstmt.setString(2, obj.getId_Funcionario());

        pstmt.executeUpdate();

    }

    @Override
    public List<Funcionario> listarDados(Funcionario obj) throws Exception {
    
        try {
            
            if(con.isClosed() == false){

                con.close();
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :"+e);

        }

        getConnection();        

        String q = "SELECT * FROM Funcionario";

        pstmt = con.prepareStatement(q);

        rs = pstmt.executeQuery();

        Funcionario t;

        List <Funcionario> listarFuncionario = new ArrayList <Funcionario>();

        while (rs.next()) {
            
            t = new Funcionario();

            t.setId_Funcionario(rs.getString("idFuncionario"));

            t.setNome(rs.getString("nomeFuncionario"));

            listarFuncionario.add(t);

        }

        return listarFuncionario;

    }
    
}