package br.com.torrentz.dal;

import br.com.torrentz.util.Conexao;
import br.com.torrentz.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VisualizacaoDal {

    private Connection conexao;

    public VisualizacaoDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Visualizacao obj) {

        String sql
                = "INSERT INTO visualizacoes(vis_completo, "
                + "vis_data, vis_usu_iden, vis_fil_iden) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getCompleto());
            ps.setObject(2, obj.getData());

            //Atributos por composição
            ps.setInt(3, obj.getUsuario().getIden());
            ps.setInt(4, obj.getFilme().getIden());

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public List<Visualizacao> read(int vis_fil_iden) {
        List<Visualizacao> array = new ArrayList<>();
        String sql
                = "SELECT * "
                + "FROM visualizacoes "
                + "WHERE vis_fil_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, vis_fil_iden);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visualizacao obj = new Visualizacao();

                //Atributos simples
                obj.setIden(rs.getInt("vis_iden"));
                obj.setCompleto(rs.getBoolean("vis_completo"));
                obj.setData(rs.getDate("vis_data"));

                //Atributos por composição
                UsuarioDal usuDal = new UsuarioDal();
                Usuario usu = usuDal.readToID(rs.getInt("vis_usu_iden"));
                obj.setUsuario(usu);

                FilmeDal filDal = new FilmeDal();
                Filme fil = filDal.readToID(rs.getInt("vis_fil_iden"));
                obj.setFilme(fil);

                // ADD obj in array
                array.add(obj);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return array;
    }

    public Visualizacao readToID(int iden) {

        Visualizacao obj = new Visualizacao();

        String sql
                = "SELECT * "
                + "FROM visualizacoes "
                + "WHERE vis_iden=?";

        try {

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                //Atributos simples
                obj.setIden(rs.getInt("vis_iden"));
                obj.setCompleto(rs.getBoolean("vis_completo"));
                obj.setData(rs.getDate("vis_data"));

                //Atributos por composição
                UsuarioDal usuDal = new UsuarioDal();
                Usuario usu = usuDal.readToID(rs.getInt("vis_usu_iden"));
                obj.setUsuario(usu);

                FilmeDal filDal = new FilmeDal();
                Filme fil = filDal.readToID(rs.getInt("vis_fil_iden"));
                obj.setFilme(fil);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return obj;
    }

    public void update(Visualizacao obj) {

        String sql
                = "UPDATE visualizacoes "
                + "SET vis_completo=?, vis_data=?, "
                + "vis_usu_iden=?, vis_fil_iden=? "
                + "WHERE vis_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getCompleto());
            ps.setObject(2, obj.getData());

            //Atributos por composição
            ps.setInt(3, obj.getUsuario().getIden());
            ps.setInt(4, obj.getFilme().getIden());

            //id objeto parametro parâmetro WHERE
            ps.setInt(5, obj.getIden());

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public void delete(int iden) {

        String sql
                = "DELETE FROM visualizacoes "
                + "WHERE vis_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            // Parametro iden
            ps.setInt(1, iden);

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
