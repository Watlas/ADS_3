package br.com.torrentz.dal;

import br.com.torrentz.model.*;
import br.com.torrentz.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDal {

    private Connection conexao;

    public UsuarioDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Usuario obj) throws Exception {

        String sql
                = "INSERT INTO usuarios(usu_nome, usu_cpf, usu_email, "
                + "usu_senha, usu_percent_cupom, usu_data_cupom)"
                + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setObject(1, obj.getNome());
            ps.setObject(2, obj.getCpf());
            ps.setObject(3, obj.getEmail());
            ps.setObject(4, obj.getSenha());
            ps.setObject(5, obj.getPercentCupom());
            ps.setObject(6, obj.getDataGeracaoCupom());

            ps.executeUpdate();

        } catch (SQLException e) {

            throw e;

        }
    }

    public List<Usuario> read() throws Exception {

        List<Usuario> array = new ArrayList<>();

        String sql
                = "SELECT * "
                + "FROM usuarios";

        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Usuario obj = new Usuario();
                obj.setIden(rs.getInt("usu_iden"));
                obj.setNome(rs.getString("usu_nome"));
                obj.setCpf(rs.getString("usu_cpf"));
                obj.setEmail(rs.getString("usu_email"));
                obj.setSenha(rs.getString("usu_senha"));
                obj.setPercentCupom(rs.getFloat("usu_percent_cupom"));
                obj.setDataGeracaoCupom(rs.getDate("usu_data_cupom"));
                array.add(obj);
            }

        } catch (SQLException e) {
            throw e;
        }

        return array;
    }

    public Usuario readToID(int iden) throws Exception {

        Usuario obj = new Usuario();

        String sql
                = "SELECT * "
                + "FROM usuarios "
                + "WHERE usu_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                //atributos simples
                obj.setIden(rs.getInt("usu_iden"));
                obj.setNome(rs.getString("usu_nome"));
                obj.setCpf(rs.getString("usu_cpf"));
                obj.setEmail(rs.getString("usu_email"));
                obj.setSenha(rs.getString("usu_senha"));
                obj.setPercentCupom(rs.getFloat("usu_percent_cupom"));
                obj.setDataGeracaoCupom(rs.getDate("usu_data_cupom"));
            }

        } catch (SQLException e) {

            throw e;

        }

        return obj;
    }

    public void update(Usuario obj) throws Exception {

        String sql
                = "UPDATE usuarios "
                + "SET usu_nome=?, usu_cpf=?, usu_email=?, usu_senha=? "
                + "WHERE usu_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //atributos simples
            ps.setObject(1, obj.getNome());
            ps.setObject(2, obj.getCpf());
            ps.setObject(3, obj.getEmail());
            ps.setObject(4, obj.getSenha());

            //id objeto selecionado para WHERE
            ps.setObject(5, obj.getIden());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public void delete(int iden) throws Exception {

        String sql
                = "DELETE FROM usuarios "
                + "WHERE usu_iden = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, iden);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {

            throw e;

        }
    }
}
