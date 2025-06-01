package Controle;

import Modelo.ClientePj;
import Modelo.Funcionario;
import Modelo.ClientePf;
import java.util.ArrayList;
import java.util.List;
import Modelo.ClientePf;
import Modelo.ClientePj;
import Modelo.Funcionario;

public interface ICRUD <t> {

    public void create(t obj) throws Exception;

    public void delete(t obj) throws Exception;

    public void update(t obj) throws Exception;

    public List <t> listarDados(t obj) throws Exception;

    public static List <ClientePf> listarClientePf = new ArrayList <>();

    public static List <ClientePj> listarClientePj = new ArrayList <>();

    public static List <Funcionario> listarFuncionario = new ArrayList <>();

}