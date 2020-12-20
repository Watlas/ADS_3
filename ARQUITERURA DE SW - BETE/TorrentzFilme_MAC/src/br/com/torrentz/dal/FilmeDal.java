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

public class FilmeDal {

    private Connection conexao;

    public FilmeDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Filme obj) {

        String sql
                = "INSERT INTO filmes("
                + "fil_ano, fil_titulo, fil_sinopse, fil_cat_iden) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setInt(1, obj.getAno());
            ps.setString(2, obj.getTitulo());
            ps.setString(3, obj.getSinopse());

            //Atributos por composição
            ps.setInt(4, obj.getCategoria().getIden());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Filme> read() {

        List<Filme> array = new ArrayList<Filme>();

        String sql
                = "SELECT * "
                + "FROM filmes";

        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Filme obj = new Filme();

                //atributos simples
                obj.setIden(rs.getInt("fil_iden"));
                obj.setAno(rs.getInt("fil_ano"));
                obj.setTitulo(rs.getString("fil_titulo"));
                obj.setSinopse(rs.getString("fil_sinopse"));

                //atributos por composição
                CategoriaDal catDal = new CategoriaDal();
                Categoria cat = catDal.readToID(rs.getInt("fil_cat_iden"));
                obj.setCategoria(cat);

                //add obj no array
                array.add(obj);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return array;
    }

    public Filme readToID(int iden) {

        Filme obj = new Filme();

        String sql
                = "SELECT * "
                + "FROM filmes "
                + "WHERE fil_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                //atributos simples
                obj.setIden(rs.getInt("fil_iden"));
                obj.setAno(rs.getInt("fil_ano"));
                obj.setTitulo(rs.getString("fil_titulo"));
                obj.setSinopse(rs.getString("fil_sinopse"));

                //atributos por composição
                CategoriaDal catDal = new CategoriaDal();
                Categoria cat = catDal.readToID(rs.getInt("fil_cat_iden"));
                obj.setCategoria(cat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void update(Filme obj) {

        String sql
                = "UPDATE filmes "
                + "SET fil_ano=?, fil_titulo=?, fil_sinopse=?, fil_cat_iden=? "
                + "WHERE fil_iden =?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //atributos simples
            ps.setInt(1, obj.getAno());
            ps.setString(2, obj.getTitulo());
            ps.setString(3, obj.getSinopse());

            //atributos por composição
            ps.setInt(4, obj.getCategoria().getIden());

            //id objeto selecionado para WHERE
            ps.setInt(5, obj.getIden());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int iden) {

        String sql
                = "DELETE FROM filmes "
                + "WHERE fil_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, iden);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
