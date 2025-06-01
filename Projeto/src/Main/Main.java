package Main;

import Controle.ClientePfDAO;
import Modelo.ClientePf;
import java.util.List;
public class Main {
    
    public static void main (String[]args){
        
        try{
           
            ClientePfDAO ClienteDAO = new ClientePfDAO();
            
            ClientePf clientepf = new ClientePf();
            ClientePfDAO ClientePf = new ClientePfDAO();
        
            List<ClientePf> lista = ClienteDAO.listarDados(null);
            
            clientepf.setId(10);
            
            
            clientepf.setCPF("14310335454");
            clientepf.setEndereco("Rua com casas");
            clientepf.setNome("Dom. Pedro");
            clientepf.setTelefone("");
            clientepf.setTipo("CPF");
            if(!lista.isEmpty()){
             
                for(ClientePf x: lista){
                    if(x.getId() == 10){
                        
                        
                        ClientePf.update(clientepf);
                    }
                    
                }
            }
        }catch(Exception e){
            
        }
        
        try{
            
            ClientePf clientepf = new ClientePf();
            ClientePfDAO ClientePf = new ClientePfDAO();
            
            clientepf.setCPF("14310335454");
            clientepf.setEndereco("Rua com casas");
            clientepf.setNome("Dom. Pedro");
            clientepf.setTelefone("0987654321");
            clientepf.setTipo("CPF");
            
            
            
        }catch(Exception e){
            
            
            
        }
        
    }
}
