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

public class CategoriaDal {

    private Connection conexao;

    public CategoriaDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Categoria obj) {
        String sql
                = "INSERT INTO categorias(cat_nome) "
                + "VALUES (?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Categoria> read() {
        List<Categoria> array = new ArrayList<Categoria>();
        String sql
                = "SELECT * "
                + "FROM categorias";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria obj = new Categoria();
                obj.setIden(rs.getInt("cat_iden"));
                obj.setNome(rs.getString("cat_nome"));
                array.add(obj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return array;
    }

    public Categoria readToID(int iden) {
        Categoria obj = new Categoria();
        String sql
                = "SELECT * "
                + "FROM categorias "
                + "WHERE cat_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                obj.setIden(rs.getInt("cat_iden"));
                obj.setNome(rs.getString("cat_nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void update(Categoria obj) {
        String sql
                = "UPDATE categorias "
                + "SET cat_nome=? "
                + "WHERE cat_iden =?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIden());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int iden) {
        String sql
                = "DELETE FROM categorias "
                + "WHERE cat_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
