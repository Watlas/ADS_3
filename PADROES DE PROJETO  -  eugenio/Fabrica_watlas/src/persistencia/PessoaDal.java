package persistencia;

import classes.Funcionario;
import util.ConexaoDal;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PessoaDal {

    private Connection conexao;

    public PessoaDal() throws Exception {
        conexao = ConexaoDal.getConexao();
    }

    public void add(Funcionario funcionario, String tipo) throws SQLException {
        String sql = "INSERT INTO pessoas(pessoa_tipo, pessoa_salario, pessoa_horas) " +
                "VALUES (?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1,tipo);
        ps.setObject(2, funcionario.getSalario());
        ps.setObject(3, funcionario.getHorasTrabalhadas());
        ps.executeUpdate();
    }
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM pessoas";
        List<Funcionario> pessoaModelList = new ArrayList<>();

        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            Funcionario  x = new Funcionario();

            x.setHorasTrabalhadas(rs.getInt("pessoa_horas"));
         //   x.setSalario(rs.getDouble("(pessoa_salario"));

            pessoaModelList.add(x);
        }
        return pessoaModelList.iterator();
    }
}
