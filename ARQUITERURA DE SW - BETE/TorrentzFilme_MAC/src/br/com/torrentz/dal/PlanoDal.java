package br.com.torrentz.dal;

import br.com.torrentz.util.Conexao;
import br.com.torrentz.model.Plano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlanoDal {

    private Connection conexao;

    public PlanoDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Plano obj) {
        String sql
                = "INSERT INTO planos(pla_acess_simult, pla_nome, pla_preco) "
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getAcessoSimultaneo());
            ps.setObject(2, obj.getNome());
            ps.setObject(3, obj.getPreco());

            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Plano> read() {
        List<Plano> planos = new ArrayList<Plano>();
        String sql
                = "SELECT * "
                + "FROM planos";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Plano obj = new Plano();

                //Atributos simples
                obj.setIden(rs.getInt("pla_iden"));
                obj.setAcessoSimultaneo(rs.getInt("pla_acess_simult"));
                obj.setNome(rs.getString("pla_nome"));
                obj.setPreco(rs.getFloat("pla_preco"));

                //Atributos por composição
                planos.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return planos;
    }

    public Plano readToID(int iden) {
        Plano obj = new Plano();
        String sql
                = "SELECT * "
                + "FROM planos "
                + "WHERE pla_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                //Atributos simples
                obj.setIden(rs.getInt("pla_iden"));
                obj.setAcessoSimultaneo(rs.getInt("pla_acess_simult"));
                obj.setNome(rs.getString("pla_nome"));
                obj.setPreco(rs.getFloat("pla_preco"));

                //Atributos por composição
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void update(Plano obj) {
        String sql
                = "UPDATE planos "
                + "SET pla_acess_simult=?, pla_nome=?, pla_preco=? "
                + "WHERE pla_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getAcessoSimultaneo());
            ps.setObject(2, obj.getNome());
            ps.setObject(3, obj.getPreco());

            //Atributos por composição
            //id objeto parametro parâmetro WHERE
            ps.setInt(4, obj.getIden());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int iden) {
        String sql
                = "DELETE FROM planos "
                + "WHERE fot_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
